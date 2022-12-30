package com.merati.backend.dao;

import com.merati.backend.dto.ProductoDto;

import java.util.List;

public interface ProductoDao {

    List<ProductoDto> obtenerInfoProducto(ProductoDto producto);
}
