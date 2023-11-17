package com.merati.backend.dto;

import lombok.Data;

@Data
public class EmpleadoDto {
	
    private Integer Cod_Empleado;
    private String Dni;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private Integer Telefono;
    private String Cargo;
    private Integer Cod_Perfil;


    public EmpleadoDto(Integer Cod_Empleado, String Dni, String Nombre,String Apellidos ,String Direccion,Integer Telefono, String Cargo,Integer Cod_Perfil) {
        this.Cod_Empleado = Cod_Empleado;
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Cargo = Cargo;
        this.Cod_Perfil = Cod_Perfil;

    }
}

