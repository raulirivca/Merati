package com.merati.backend.controller;

import com.merati.backend.dto.ProductoDto;
import com.merati.backend.service.ServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"*"})
public class ProductoControlador {
    @Autowired
    private ServicioProducto service;
    @RequestMapping(
            value = "/obtenerProducto",
            method = RequestMethod.GET,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    List<ProductoDto> obtenerProducto(ProductoDto productoDto){
        return service.obtenerInfoProducto(productoDto);
    }
}

