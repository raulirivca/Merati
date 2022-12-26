package com.backend.backend.dto.rest;

import com.backend.backend.dto.OrdenPedidoXDeliveryDto;
import lombok.Data;

import java.util.List;

@Data
public class RptaOrdenPedidoXDelivery {
    private List<OrdenPedidoXDeliveryDto> ordenDelivery;
}
