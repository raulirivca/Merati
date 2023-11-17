package com.merati.backend.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class OrdenPedidoXDeliveryDto {

    private Integer Cod_Delivry;
    private Integer Cod_Pedido;
    private Time hora;
    private Date fecha;


    public OrdenPedidoXDeliveryDto(Integer Cod_Delivry, Integer Cod_Pedido,Time hora , Date fecha) {
        this.Cod_Delivry = Cod_Delivry;
        this.Cod_Pedido = Cod_Pedido;
        this.hora = hora;
        this.fecha = fecha;

    }

}
