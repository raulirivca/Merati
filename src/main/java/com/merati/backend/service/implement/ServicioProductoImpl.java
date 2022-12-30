package com.merati.backend.service.implement;

import com.merati.backend.dao.ProductoDao;
import com.merati.backend.dto.ProductoDto;
import com.merati.backend.service.ServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ServicioProductoImpl implements ServicioProducto {
    @Autowired
    ProductoDao dao;
    @Override
    public List<ProductoDto>  obtenerInfoProducto(ProductoDto producto) {
        return (List<ProductoDto>) dao.obtenerInfoProducto(producto);
    }
}

