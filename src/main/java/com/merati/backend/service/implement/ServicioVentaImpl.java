package com.merati.backend.service.implement;

import com.merati.backend.dao.VentaDao;
import com.merati.backend.dto.VentaDto;
import com.merati.backend.service.ServicioVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioVentaImpl implements ServicioVenta {
    @Autowired
    VentaDao dao;
    @Override
    public VentaDto obtenerInfoVenta() {
        return dao.obtenerInfoVenta();
    }
}

