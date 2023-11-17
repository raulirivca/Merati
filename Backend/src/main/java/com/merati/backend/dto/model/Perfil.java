package com.merati.backend.dto.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "perfil", uniqueConstraints = @UniqueConstraint(columnNames = "usuario"))
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Cod_Perfil;

    @Column(name = "nombre")
    private String Nombre;
    @Column(name = "apellidopaterno")
    private String Apellidopaterno;
    @Column(name = "apellidomaterno")
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

    public Perfil(Integer cod_Perfil, String nombre, String apellidopaterno, String apellidomaterno, String usuario, String contrasena) {
        super();
        this.Cod_Perfil = cod_Perfil;
        this.Nombre = nombre;
        this.Apellidopaterno = apellidopaterno;
        this.Apellidomaterno = apellidomaterno;
        this.Usuario = usuario;
        this.Contrasena = contrasena;
    }

    public Perfil(String nombre, String apellidopaterno, String apellidomaterno, String usuario, String contrasena) {
        super();
        this.Nombre = nombre;
        this.Apellidopaterno = apellidopaterno;
        this.Apellidomaterno = apellidomaterno;
        this.Usuario = usuario;
        this.Contrasena = contrasena;
    }
    public Perfil() {

    }
}
