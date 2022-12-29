package com.merati.backend.controller;

import com.merati.backend.dto.ProductoDto;
import com.merati.backend.service.ServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class ProductoControlador {
    @Autowired
    private ServicioProducto service;
    @RequestMapping(
            value = "/obtenerProducto",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    ProductoDto obtenerProducto(){
        return service.obtenerInfoProducto();
    }
}

