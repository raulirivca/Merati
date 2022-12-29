package com.merati.backend.dto.rest;

import com.merati.backend.dto.OrdenPedidoXDeliveryDto;
import lombok.Data;

import java.util.List;

@Data
public class RptaOrdenPedidoXDelivery {
    private List<OrdenPedidoXDeliveryDto> ordenDelivery;
}
