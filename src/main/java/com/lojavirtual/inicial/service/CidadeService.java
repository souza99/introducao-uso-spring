package com.lojavirtual.inicial.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.inicial.entity.Cidade;
import com.lojavirtual.inicial.repository.CidadeRepository;

@Service
public class CidadeService {
    
    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> buscarTodos() {
        return cidadeRepository.findAll();
    }

    public Cidade salvar(Cidade object) {
        object.setDataCadastro(new Date());
        Cidade newObject = cidadeRepository.saveAndFlush(object);
        return newObject;
    }

    public Cidade editar(Cidade object) {
        object.setDataAtualizacao(new Date());
        return cidadeRepository.saveAndFlush(object);
    }

    public void deletar(Long id) {
        Cidade object = cidadeRepository.findById(id).get();
        cidadeRepository.delete(object);
    }
}
