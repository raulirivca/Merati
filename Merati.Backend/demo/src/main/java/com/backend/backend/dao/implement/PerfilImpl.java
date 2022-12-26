package com.backend.backend.dao.implement;

import com.backend.backend.dao.PerfilDao;
import com.backend.backend.dto.PerfilDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;

public class PerfilImpl implements PerfilDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Connection conexion;
    private void obtenerConexion() {
        try {
            this.conexion = jdbcTemplate.getDataSource().getConnection();
            conexion.setAutoCommit(false);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    private void cerrarConexion(ResultSet resultado, Statement sentencia) {
        try {
            if (resultado != null) resultado.close();
            if (sentencia != null) sentencia.close();
            this.conexion.commit();
            this.conexion.close();
            this.conexion = null;
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
    
    /*
    Para mostrar en la pantalla los roles a escoger en la creacion del usuario
    */

    @Override
    public PerfilDto mostrarUsuarioResponsable() {
        UsuarioDto usuario = new UsuarioDto();
        String sql = "select u.dni_usuario as \"DNI RESPONSABLE\",\n" +
                "u.nombres_usuario ||' '|| u.apellidos_usuario as \"NOMBRE RESPONSABLE\"\n" +
                "from usuario u\n" +
                "inner join orden o \n" +
                "on o.id_usuario =u.id_usuario \n" +
                "where o.id_orden =1";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                usuario=(extraerTipoUsuario(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usuario;
    }

    private PerfilDto extraerTipoUsuario(ResultSet resultado) throws SQLException {
        PerfilDto retorno = new UsuarioDto(
                null,
                resultado.getString("DNI RESPONSABLE"),
                resultado.getString("NOMBRE RESPONSABLE"),
                null,
                null,
                null
        );
        return retorno;
    }

}
