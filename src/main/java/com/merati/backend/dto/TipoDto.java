package com.merati.backend.dto;

import lombok.Data;

@Data
public class TipoDto {
	
    private Integer Cod_Tipo;
    private String Descripcion;
    private Integer Stock;
    private Integer Precio;


    public TipoDto(Integer Cod_Tipo, String Descripcion, Integer Stock, Integer Precio) {
        this.Cod_Tipo = Cod_Tipo;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.Precio = Precio;

    }
}

