package com.backend.backend.service.implement;

import com.backend.backend.dao.ClienteDao;
import com.backend.backend.dto.ClienteDto;
import com.backend.backend.service.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioClienteImpl implements ServicioCliente {
    @Autowired
    ClienteDao dao;
    @Override
    public ClienteDto obtenerInfoCliente() {
        return dao.obtenerInfoCliente();
    }
}

