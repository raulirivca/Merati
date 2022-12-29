package com.merati.backend.service.implement;

import com.merati.backend.dao.PerfilDao;
import com.merati.backend.dto.PerfilDto;
import com.merati.backend.service.ServicioPerfil;
import org.springframework.beans.factory.annotation.Autowired;

public class ServicioPerfilImpl implements ServicioPerfil {
    @Autowired
    private PerfilDao perfilDao;
    @Override
    public PerfilDto findbyusername(String usuario) {
        return null;
    }
}
