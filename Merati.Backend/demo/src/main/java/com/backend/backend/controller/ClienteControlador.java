package com.backend.backend.controller;

import com.backend.backend.dto.ClienteDto;
import com.backend.backend.service.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class ProductoControlador {
    @Autowired
    private ServicioCliente service;
    @RequestMapping(
            value = "/obtenerCliente",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    ClienteDto obtenerCliente(){
        return service.obtenerCliente();
    }
}

