package com.backend.backend.dto;

import lombok.Data;

@Data
public class ProductoXTipoDto {
	
    private Integer Cod_Producto;
    private Integer Cod_Tipo;


    public ProductoXTipoDto( Integer Cod_Producto , Integer Cod_Tipo) {

        this.Cod_Producto = Cod_Producto;
        this.Cod_Tipo = Cod_Tipo;

    }
}

