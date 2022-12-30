package com.merati.backend.dto;

import lombok.Data;
import java.sql.Date;

@Data
public class OrdenPedidoDto{
	
	private Integer Cod_Pedido;
    private Integer Cantidad;
    private Date Fecha_Pedido;
    private String Ubicacion;
    private Integer Cod_Cliente;


    public OrdenPedidoDto(int codPedido, int cantidad, Date fechaPedido, String ubicacion, int codCliente) {
        super();
        this.Cod_Pedido = Cod_Pedido;
        this.Cantidad = Cantidad;
        this.Fecha_Pedido = Fecha_Pedido;
        this.Ubicacion = Ubicacion;
        this.Cod_Cliente = Cod_Cliente;
    }
}