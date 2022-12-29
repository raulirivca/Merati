package com.merati.backend.dto;

import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
public class OrdenPedidoXProductoDto {

    private Integer Cod_Producto;
    private Integer Cod_Pedido;
    private Time hora;
    private Date fecha;


    public OrdenPedidoXProductoDto(Integer Cod_Producto, Integer Cod_Pedido,Time hora , Date fecha) {
        this.Cod_Producto = Cod_Producto;
        this.Cod_Pedido = Cod_Pedido;
        this.hora = hora;
        this.fecha = fecha;

    }

}
