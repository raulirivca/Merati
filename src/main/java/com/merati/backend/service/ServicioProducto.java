package com.merati.backend.service;

import com.merati.backend.dto.ProductoDto;

import java.util.List;

public interface ServicioProducto{

    List<ProductoDto> obtenerInfoProducto(ProductoDto producto);
}