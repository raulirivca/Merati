package com.merati.backend.dao;

import com.merati.backend.dto.OrdenPedidoDto;

import java.util.List;

public interface OrdenPedidoDao {
    public List<OrdenPedidoDto> extraerOrdenPedido();
}
