package com.backend.backend.dto;

import lombok.Data;
import java.sql.Date;

@Data
public class OrdenPedidoDto{
	
	private Integer Cod_Pedido;
    private Integer Cantidad;
    private Date Fecha_Pedido;
    private String Ubicacion;
    private Integer Cod_Empelado;
    private Integer Cod_Cliente;


    public OrdenPedidoDto(Integer Cod_Pedido,Integer Cantidad, Date Fecha_Pedido,String Ubicacion,Integer Cod_Empelado,Integer Cod_Cliente) {
        this.Cod_Pedido = Cod_Pedido;
        this.Cantidad = Cantidad;
        this.Fecha_Pedido = Fecha_Pedido;
        this.Ubicacion = Ubicacion;
        this.Cod_Empelado = Cod_Empelado;
        this.Cod_Cliente = Cod_Cliente;

    }
}