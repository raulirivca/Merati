package com.backend.backend.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class OrdenPedidoXOfertaDto {

    private Integer Cod_Oferta;
    private Integer Cod_Pedido;
    private Time hora;

    public OrdenPedidoXOfertaDto(Integer Cod_Oferta, Integer Cod_Pedido,Time hora ) {
        this.Cod_Oferta = Cod_Oferta;
        this.Cod_Pedido = Cod_Pedido;
        this.hora = hora;

    }

}
