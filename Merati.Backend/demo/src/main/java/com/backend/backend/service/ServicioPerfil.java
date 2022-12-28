package com.backend.backend.service;

import com.backend.backend.dto.PerfilDto;

public interface ServicioPerfil {
    public PerfilDto findbyusername(String usuario);

}
