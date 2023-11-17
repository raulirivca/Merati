package com.merati.backend.dto;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class VentaDto {
	
    private Integer Cod_Venta;
    private String Cantidad;
    private Date FechaVenta;
    private Time HoraVenta;
    private Integer Cod_Empleado;


    public VentaDto(Integer Cod_Venta, String Cantidad, Date FechaVenta, Time HoraVenta , Integer Cod_Empleado) {
        this.Cod_Venta = Cod_Venta;
        this.Cantidad = Cantidad;
        this.FechaVenta = FechaVenta;
        this.HoraVenta = HoraVenta;
        this.Cod_Empleado = Cod_Empleado;

    }
}

