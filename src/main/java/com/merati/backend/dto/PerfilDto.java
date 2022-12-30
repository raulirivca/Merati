package com.merati.backend.dto;

import lombok.Data;


public class PerfilDto {
    private Integer Cod_Perfil;
    private String Nombre;
    private String Apellidopaterno;
    private String Apellidomaterno;
    private String Usuario;
    private String Contrasena;

    public Integer getCod_Perfil() {
        return Cod_Perfil;
    }

    public void setCod_Perfil(Integer cod_Perfil) {
        Cod_Perfil = cod_Perfil;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidopaterno() {
        return Apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        Apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return Apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        Apellidomaterno = apellidomaterno;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public PerfilDto(Integer cod_Perfil, String nombre, String apellidopaterno, String apellidomaterno, String usuario, String contrasena) {
        super();
        this.Cod_Perfil = cod_Perfil;
        this.Nombre = nombre;
        this.Apellidopaterno = apellidopaterno;
        this.Apellidomaterno = apellidomaterno;
        this.Usuario = usuario;
        this.Contrasena = contrasena;
    }

    public PerfilDto() {
    }
}

