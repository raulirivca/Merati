package com.merati.backend.controller;

import com.merati.backend.dto.TipoDto;
import com.merati.backend.service.ServicioTipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class TipoControlador {
    @Autowired
    private ServicioTipo service;
    @RequestMapping(
            value = "/obtenerTipo",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    TipoDto obtenerTipo(){
        return service.obtenerInfoTipo();
    }
}

