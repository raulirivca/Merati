package com.backend.backend.controller;

import com.backend.backend.dto.TipoDto;
import com.backend.backend.service.ServicioTipo;
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
        return service.obtenerTipo();
    }
}

