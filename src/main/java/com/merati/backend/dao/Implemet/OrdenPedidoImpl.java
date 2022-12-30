package com.merati.backend.dao.Implemet;

import com.merati.backend.dao.OrdenPedidoDao;
import com.merati.backend.dto.OrdenPedidoDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class OrdenPedidoImpl implements OrdenPedidoDao {
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

    @Override
    public List<OrdenPedidoDto> extraerOrdenPedido() {
        List<OrdenPedidoDto> lista = new ArrayList<>();
        String sql = "select o.Cod_Pedido,o.cantidad ,o.fecha_pedido from ordenpedido o  where ((select avg(o.cantidad) from ordenpedido o)< o.cantidad)";
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                lista.add(OrdenPedido(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;
    }
    private OrdenPedidoDto OrdenPedido(ResultSet resultado) throws SQLException {
    	OrdenPedidoDto reporte = new OrdenPedidoDto(
                resultado.getInt("Cod_Pedido"),
                resultado.getInt("Cantidad"),
                resultado.getDate("Fecha_Pedido"),
                resultado.getString("Ubicacion"),
                resultado.getInt("Cod_Cliente")
        );
        return reporte;
    }
}
