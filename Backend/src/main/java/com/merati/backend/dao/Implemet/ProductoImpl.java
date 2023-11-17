package com.merati.backend.dao.Implemet;


import com.merati.backend.dao.ProductoDao;
import com.merati.backend.dto.ProductoDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoImpl implements ProductoDao {
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
    public List<ProductoDto> obtenerInfoProducto(ProductoDto producto) {
        producto = new ProductoDto();
        String sql = " select p.nombre,t.descripcion,t.precio,t.stock from producto p inner join productoxtipo pt on p.cod_producto=pt.cod_producto \r\n"
        		+ " inner join tipo t on pt.cod_tipo=t.cod_tipo ";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, producto.getCod_Producto());
            ResultSet resultado = sentencia.executeQuery();

            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return (List<ProductoDto>) producto;
    }

    private ProductoDto extraerProducto(ResultSet resultado) throws SQLException {
    	ProductoDto producto = new ProductoDto(
                resultado.getInt("Cod_Producto"),
                null,
                null
        );
        return producto;
    }

}
