package com.backend.backend.controller;

import com.backend.backend.dto.OrdenPedidoDto;
import com.backend.backend.service.ServicioOrdenPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"*"})
public class OrdenPedidoControlador {
    @Autowired
    private ServicioOrdenPedido service;
    @RequestMapping(
            value = "/obtenerOrdenPedido",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody
    OrdenPedidoDto obtenerOrdenPedido(){
        return service.obtenerOrdenPedido();
    }
}

