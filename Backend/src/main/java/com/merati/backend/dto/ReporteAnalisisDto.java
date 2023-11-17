package com.merati.backend.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ReporteAnalisisDto {
	private Integer Id_Reporte;
	private Integer VentasTotales;
    private String ProductoMasVendido;
    private Integer Crecimiento;
    private Date FechaInicio;
    private Date FechaFin;
    private Integer Cod_Empleado;

    public ReporteAnalisisDto(Integer Id_Reporte, Integer VentasTotales, String ProductoMasVendido,Integer Crecimiento,Date FechaInicio,Date FechaFin,Integer Cod_Empleado) {
        this.Id_Reporte = Id_Reporte;
        this.VentasTotales = VentasTotales;
        this.ProductoMasVendido = ProductoMasVendido;
        this.Crecimiento = Crecimiento;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Cod_Empleado = Cod_Empleado;
    }
}

