package com.merati.backend.service.implement;

import com.merati.backend.dao.ClienteDao;
import com.merati.backend.dto.ClienteDto;
import com.merati.backend.service.ServicioCliente;
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

