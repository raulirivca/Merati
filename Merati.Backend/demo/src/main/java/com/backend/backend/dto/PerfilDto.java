package com.backend.backend.dto;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "Perfil")
public class PerfilDto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Cod_Perfil;
    private String Usuario;
    private String Contrasena;
    private String TipoUsuario;

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

