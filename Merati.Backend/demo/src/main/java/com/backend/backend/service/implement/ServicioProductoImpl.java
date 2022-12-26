package com.backend.backend.service.implement;

import com.backend.backend.dao.ProductoDao;
import com.backend.backend.dto.ProductoDto;
import com.backend.backend.service.ServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioProductoImpl implements ServicioProducto {
    @Autowired
    ProductoDao dao;
    @Override
    public ProductoDto obtenerInfoProducto() {
        return dao.obtenerInfoProducto();
    }
}

