package com.merati.backend.dto;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Perfil",uniqueConstraints = @UniqueConstraint(columnNames = "Usuario"))
public class PerfilDto implements Serializable {


    public PerfilDto(Integer Cod_Perfil, String Usuario, String Contrasena, String TipoUsuario) {
        this.Cod_Perfil = Cod_Perfil;
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.TipoUsuario = TipoUsuario;
        
    }

    public PerfilDto() {

    }

    public Integer getCod_Perfil() {
        return Cod_Perfil;
    }

    public void setCod_Perfil(Integer cod_Perfil) {
        Cod_Perfil = cod_Perfil;
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

    public String getTipoUsuario() {
        return TipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        TipoUsuario = tipoUsuario;
    }
}

