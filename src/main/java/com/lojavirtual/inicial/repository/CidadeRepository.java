package com.lojavirtual.inicial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.inicial.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    
}
