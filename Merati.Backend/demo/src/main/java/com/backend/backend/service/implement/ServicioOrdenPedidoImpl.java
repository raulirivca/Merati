package com.backend.backend.service.Implementacion;

import com.backend.backend.dao.OrdenPedidoDao;
import com.backend.backend.dto.OrdenPedidoDto;
import com.backend.backend.service.ServicioOrdenPedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServicioOrdenPedidoImpl implements ServicioOrdenPedido {
    @Autowired
    OrdenPedidoDao dao;
    @Override
    public OrdenPedidoDto obtenerInfoOrdenPedido() {
        return dao.obtenerInfoOrdenPedido();
    }
}

