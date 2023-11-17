package com.merati.backend.dto;

import lombok.Data;

@Data
public class ClienteDto {
	
    private Integer Cod_Cliente;
    private String Nombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private Integer Cod_Perfil;


    public ClienteDto(Integer Cod_Cliente, String Nombre, String ApellidoPaterno, String ApellidoMaterno , Integer Cod_Perfil) {
        this.Cod_Cliente = Cod_Cliente;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Cod_Perfil = Cod_Perfil;

    }
}


