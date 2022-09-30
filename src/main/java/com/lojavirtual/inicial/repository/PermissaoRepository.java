package com.lojavirtual.inicial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.inicial.entity.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
    
}
