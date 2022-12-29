package com.merati.backend.service;

import com.merati.backend.dto.PerfilDto;

public interface ServicioPerfil {
    public PerfilDto findbyusername(String usuario);

}
