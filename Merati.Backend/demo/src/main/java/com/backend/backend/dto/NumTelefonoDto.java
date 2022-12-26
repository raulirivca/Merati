package com.backend.backend.dto;

import lombok.Data;

@Data
public class NumTelefonoDto {

    private Integer Numero_Telefono;
    private Integer TelefonoFijo;
    private Integer TelefonoCelular;
    private Integer Cod_Cliente;

    public NumTelefonoDto(Integer Numero_Telefono, Integer TelefonoFijo, Integer TelefonoCelular, Integer Cod_Cliente) {
        this.Numero_Telefono = Numero_Telefono;
        this.TelefonoFijo = TelefonoFijo;
        this.TelefonoCelular = TelefonoCelular;
        this.Cod_Cliente = Cod_Cliente;
    }
}

