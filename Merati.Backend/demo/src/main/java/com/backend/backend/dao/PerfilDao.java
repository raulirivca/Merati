package com.backend.backend.dao;

import com.backend.backend.dto.PerfilDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilDao extends JpaRepository<PerfilDto, Integer> {
    public PerfilDto findbyusername(String usuario);
}
