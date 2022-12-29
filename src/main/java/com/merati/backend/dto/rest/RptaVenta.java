package com.merati.backend.dto.rest;

import com.merati.backend.dto.VentaDto;
import lombok.Data;

import java.util.List;
@Data
public class RptaVenta {
    private List<VentaDto> venta;
}

