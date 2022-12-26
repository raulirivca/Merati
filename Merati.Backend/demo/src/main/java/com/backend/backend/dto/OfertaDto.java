package com.backend.backend.dto;

import lombok.Data;


@Data
public class OfertaDto{
   
    private Integer Cod_Oferta;
    private String Tipo_Oferta;
    private String Descripcion;
    private Integer Cod_Cliente;

    public OfertaDto(Integer Cod_Oferta, String Tipo_Oferta,  String Descripcion, Integer Cod_Cliente) {
        this.Cod_Oferta = Cod_Oferta;
        this.Tipo_Oferta = Tipo_Oferta;
        this.Descripcion = Descripcion;
        this.Cod_Cliente = Cod_Cliente;
    }

}
