package com.backend.backend.dto;

import lombok.Data;

@Data
public class PerfilDto {
    private Integer Cod_Perfil;
    private String Usuario;
    private String Contrase�a;
    private String TipoUsuario;

    public PerfilDto(Integer Cod_Perfil, String Usuario, String Contrase�a, String TipoUsuario) {
        this.Cod_Perfil = Cod_Perfil;
        this.Usuario = Usuario;
        this.Contrase�a = Contrase�a;
        this.TipoUsuario = TipoUsuario;
        
    }
}

