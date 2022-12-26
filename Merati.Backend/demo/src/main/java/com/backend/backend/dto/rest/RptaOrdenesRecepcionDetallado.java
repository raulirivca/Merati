package com.backend.backend.dto.rest;

import com.backend.backend.dto.OrdenPedidoDto;
import lombok.Data;

import java.util.List;

@Data
public class RptaOrdenPedido {
    private List<OrdenPedidoDto> ordenes;
}
