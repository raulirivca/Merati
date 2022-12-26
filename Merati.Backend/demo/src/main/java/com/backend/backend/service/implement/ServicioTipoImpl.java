package com.backend.backend.servicio.Implementacion;

import com.backend.backend.dao.TipoDao;
import com.backend.backend.dto.TipoDto;
import com.backend.backend.servicio.ServicioTipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioTipoImpl implements ServicioTipo {
    @Autowired
    TipoDao dao;
    @Override
    public TipoDto obtenerInfoTipo() {
        return dao.obtenerInfoTipo();
    }
}

