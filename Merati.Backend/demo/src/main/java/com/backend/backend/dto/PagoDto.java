package com.backend.backend.dto;

import lombok.Data;

@Data
public class PagoDto {
	
    private Integer Cod_Pago;
    private Integer Monto;
    private Integer Cod_Venta;
    private Integer Cod_Cliente;


    public PagoDto(Integer Cod_Pago, Integer Monto, Integer Cod_Venta , Integer Cod_Cliente) {
        this.Cod_Pago = Cod_Pago;
        this.Monto = Monto;
        this.Cod_Venta = Cod_Venta;
        this.Cod_Cliente = Cod_Cliente;

    }
}

