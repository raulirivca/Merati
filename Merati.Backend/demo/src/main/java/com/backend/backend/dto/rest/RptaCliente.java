package com.backend.backend.dto.rest;

import com.backend.backend.dto.ClienteDto;
import lombok.Data;

import java.util.List;
@Data
public class RptaCliente {
    private List<ClienteDto> cliente;
}

