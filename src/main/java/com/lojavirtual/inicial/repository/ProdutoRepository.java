package com.lojavirtual.inicial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.inicial.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
