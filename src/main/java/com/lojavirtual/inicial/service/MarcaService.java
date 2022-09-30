package com.lojavirtual.inicial.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.inicial.entity.Marca;
import com.lojavirtual.inicial.repository.MarcaRepository;

@Service
public class MarcaService {
    
    @Autowired
    MarcaRepository marcaRepository;

    public List<Marca> buscarTodos() {
        return marcaRepository.findAll();
    }

    public Marca salvar(Marca object) {
        object.setDataCadastro(new Date());
        Marca newObject = marcaRepository.saveAndFlush(object);
        return newObject;
    }

    public Marca editar(Marca object) {
        object.setDataAtualizacao(new Date());
        Marca returnObject = marcaRepository.saveAndFlush(object);
        return returnObject;
    }
}
