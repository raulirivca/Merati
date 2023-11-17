package com.merati.backend.dto;


import lombok.Data;

@Data
public class DeliveryDto {
    private Integer Cod_Delivery;
    private String ruta;
    private Integer Cod_Cliente;

    public DeliveryDto(Integer Cod_Delivery, String Ruta, Integer Cod_Cliente) {
        this.Cod_Delivery = Cod_Delivery;
        this.ruta = Ruta;
        this.Cod_Cliente = Cod_Cliente;
    }
}
