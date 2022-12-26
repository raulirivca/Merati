package com.merati.backend.controlador;

import com.merati.backend.demo.dto.AlmacenDto;
import com.merati.backend.servicio.ServicioAlmacen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class AlmacenControlador {
    @Autowired
    private ServicioAlmacen service;
    @RequestMapping(
            value = "/obtenerInfoAlmacen",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    AlmacenDto obtenerInfoAlmacen(){
        return service.obtenerInfoAlmacen();
    }
}

