package com.merati.backend.controller;

import com.merati.backend.dto.ClienteDto;
import com.merati.backend.service.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class ClienteControlador {
    @Autowired
    private ServicioCliente service;
    @RequestMapping(
            value = "/obtenerCliente",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    ClienteDto obtenerInfoCliente(){
        return service.obtenerInfoCliente();
    }
}

