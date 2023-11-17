package com.merati.backend.dto;

import lombok.Data;

@Data
public class ProductoDto {
	
    private Integer Cod_Producto;
    private String Nombre;
    private Integer Cod_Venta;


    public ProductoDto( Integer Cod_Producto ,String Nombre, Integer Cod_Venta) {

        this.Cod_Producto = Cod_Producto;
        this.Nombre = Nombre;
        this.Cod_Venta = Cod_Venta;
    }

    public ProductoDto() {

    }

    public Integer getCod_Producto() {
        return Cod_Producto;
    }

    public void setCod_Producto(Integer cod_Producto) {
        Cod_Producto = cod_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getCod_Venta() {
        return Cod_Venta;
    }

    public void setCod_Venta(Integer cod_Venta) {
        Cod_Venta = cod_Venta;
    }
}

