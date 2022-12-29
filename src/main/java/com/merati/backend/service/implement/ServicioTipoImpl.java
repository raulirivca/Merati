package com.merati.backend.service.implement;

import com.merati.backend.dao.TipoDao;
import com.merati.backend.dto.TipoDto;
import com.merati.backend.service.ServicioTipo;
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

