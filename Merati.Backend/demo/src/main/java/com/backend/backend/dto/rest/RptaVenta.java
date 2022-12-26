package com.backend.backend.dto.rest;

import com.backend.backend.dto.VentaDto;
import lombok.Data;

import java.util.List;
@Data
public class RptaVenta {
    private List<VentaDto> venta;
}

