package com.merati.backend.dto;

import lombok.Data;

@Data
public class ProductoDto {
	
    private Integer Cod_Producto;
    private String Nombre;
    private Integer Cod_Venta;


    public ProductoDto( Integer Cod_Producto ,String Nombre, Integer Cod_Venta) {

        this.Cod_Producto = Cod_Producto;
        this.Nombre = Nombre;
        this.Cod_Venta = Cod_Venta;
    }
}

