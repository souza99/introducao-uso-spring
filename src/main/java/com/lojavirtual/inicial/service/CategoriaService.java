package com.lojavirtual.inicial.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.inicial.entity.Categoria;
import com.lojavirtual.inicial.repository.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> buscarTodas() {
        return categoriaRepository.findAll();
    }

    public Categoria salvar(Categoria object) {
        object.setDataCadastro(new Date());
        Categoria newObject = categoriaRepository.saveAndFlush(object);
        return newObject;
    }

    public Categoria editar(Categoria object) {
        object.setDataAtualizacao(new Date());
        Categoria newObject = categoriaRepository.saveAndFlush(object);
        return newObject;
    }

    public void deletar(Long id) {
        Categoria object = categoriaRepository.findById(id).get();
        categoriaRepository.delete(object);
    }
}
