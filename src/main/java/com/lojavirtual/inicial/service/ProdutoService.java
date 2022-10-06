package com.lojavirtual.inicial.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.inicial.entity.Produto;
import com.lojavirtual.inicial.repository.ProdutoRepository;

@Service
public class ProdutoService {
    
    @Autowired
    ProdutoRepository produtoRepository;

    public List<Produto> listalTodos() {
        return produtoRepository.findAll();
    }
    
    public Produto salvar(Produto objetc) {
        objetc.setDataCadastro(new Date());
        Produto newObject = produtoRepository.saveAndFlush(objetc);
        return newObject;
    }

    public Produto editar(Produto object) {
        object.setDataAtualizacao(new Date());
        Produto newObject = produtoRepository.saveAndFlush(object);
        return newObject;
    }

    public void deletar(Long id) {
        Produto objectRepository = produtoRepository.findById(id).get();
        produtoRepository.delete(objectRepository);
    }

}