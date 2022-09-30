package com.lojavirtual.inicial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.inicial.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long>{
    
}
