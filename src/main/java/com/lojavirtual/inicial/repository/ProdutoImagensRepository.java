package com.lojavirtual.inicial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.inicial.entity.ProdutoImagens;

public interface ProdutoImagensRepository extends JpaRepository<ProdutoImagens, Long> {
    
    public List<ProdutoImagens> findByProdutoId(Long id);
}
