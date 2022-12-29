package com.merati.backend.dto.rest;

import com.merati.backend.dto.ClienteDto;
import lombok.Data;

import java.util.List;
@Data
public class RptaCliente {
    private List<ClienteDto> cliente;
}

