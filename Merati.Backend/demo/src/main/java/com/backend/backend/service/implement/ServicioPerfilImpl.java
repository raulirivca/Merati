package com.backend.backend.service.implement;

import com.backend.backend.dao.PerfilDao;
import com.backend.backend.dto.PerfilDto;
import com.backend.backend.service.ServicioPerfil;
import org.springframework.beans.factory.annotation.Autowired;

public class ServicioPerfilImpl implements ServicioPerfil {
    @Autowired
    private PerfilDao perfilDao;
    @Override
    public PerfilDto findbyusername(String usuario) {
        return null;
    }
}
