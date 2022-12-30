package com.merati.backend.service.implement;

import com.merati.backend.dao.OrdenPedidoDao;
import com.merati.backend.dto.OrdenPedidoDto;
import com.merati.backend.service.ServicioOrdenPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioOrdenPedidoImpl implements ServicioOrdenPedido {
    @Autowired
    OrdenPedidoDao dao;
    @Override
    public OrdenPedidoDto extraerOrdenPedido() {
        return (OrdenPedidoDto) dao.extraerOrdenPedido();
    }
}

