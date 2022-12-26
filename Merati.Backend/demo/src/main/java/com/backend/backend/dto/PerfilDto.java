package com.backend.backend.dto;

import lombok.Data;

@Data
public class PerfilDto {
    private Integer Cod_Perfil;
    private String Usuario;
    private String Contraseņa;
    private String TipoUsuario;

    public PerfilDto(Integer Cod_Perfil, String Usuario, String Contraseņa, String TipoUsuario) {
        this.Cod_Perfil = Cod_Perfil;
        this.Usuario = Usuario;
        this.Contraseņa = Contraseņa;
        this.TipoUsuario = TipoUsuario;
        
    }
}

