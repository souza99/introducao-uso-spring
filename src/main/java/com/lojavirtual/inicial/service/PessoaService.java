package com.lojavirtual.inicial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

import com.lojavirtual.inicial.entity.Pessoa;
import com.lojavirtual.inicial.repository.PessoaRepository;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository pessoaRepository;

    public List<Pessoa> buscartodas() {
        return pessoaRepository.findAll();
    }

    public Pessoa salvar(Pessoa object) {
        object.setDataCriacao(new Date());
        Pessoa newObject = pessoaRepository.saveAndFlush(object);
        return newObject;
    }

    public Pessoa editar(Pessoa object) {
        object.setDataAtualizacao(new Date());
        Pessoa returnObject = pessoaRepository.saveAndFlush(object);
        return returnObject;
    }

    public void deletar(Long id) {
        Pessoa object = pessoaRepository.findById(id).get();
        pessoaRepository.delete(object);
    }
}
