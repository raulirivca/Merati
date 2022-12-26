package com.backend.backend.controller;

import com.backend.backend.dto.VentaDto;
import com.backend.backend.service.ServicioVenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class VentaControlador {
    @Autowired
    private ServicioVenta service;
    @RequestMapping(
            value = "/obtenerVenta",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    VentaDto obtenerVenta(){
        return service.obtenerVenta();
    }
}

