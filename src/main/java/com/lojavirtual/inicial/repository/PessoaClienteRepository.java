package com.lojavirtual.inicial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojavirtual.inicial.entity.Permissao;
import com.lojavirtual.inicial.entity.Pessoa;

import java.util.List;

public interface PessoaClienteRepository extends JpaRepository<Pessoa, Long> {

    List<Permissao> findByNome(String nome);
}
