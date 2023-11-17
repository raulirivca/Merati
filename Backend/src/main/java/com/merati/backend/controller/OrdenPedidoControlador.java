package com.merati.backend.controller;

import com.merati.backend.dto.OrdenPedidoDto;
import com.merati.backend.service.ServicioOrdenPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class OrdenPedidoControlador {
    @Autowired
    private ServicioOrdenPedido service;
    @RequestMapping(
            value = "/obtenerOrdenPedido",
            method = RequestMethod.GET,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    OrdenPedidoDto obtenerInfoOrdenPedido(){
        return service.extraerOrdenPedido();
    }
}

