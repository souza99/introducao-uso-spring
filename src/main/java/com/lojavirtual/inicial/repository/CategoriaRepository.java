package com.lojavirtual.inicial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.inicial.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
