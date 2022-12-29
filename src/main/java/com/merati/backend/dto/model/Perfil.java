package com.merati.backend.dto.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "perfil", uniqueConstraints = @UniqueConstraint(columnNames = "usuario"))
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Cod_Perfil;

    @Column(name = "Usuario")
    private String Usuario;

    @Column(name = "Contrasena")
    private String Contrasena;


    private String TipoUsuario;


}
