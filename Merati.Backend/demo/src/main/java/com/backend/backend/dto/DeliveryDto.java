package com.backend.backend.dto;


import lombok.Data;

@Data
public class DeliveryDto {
    private Integer Cod_Delivery;
    private String ruta;
    private Integer Cod_Cliente;

    public DeliveryDto(Integer idPaquete, String tipoBien, Integer unidades) {
        this.Cod_Delivery = Cod_Delivery;
        this.Ruta = Ruta;
        this.Cod_Cliente = Cod_Cliente;
    }
}
