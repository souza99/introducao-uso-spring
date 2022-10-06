package com.lojavirtual.inicial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojavirtual.inicial.entity.Produto;
import com.lojavirtual.inicial.service.ProdutoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/produto")
public class ProdutoController {
    @Autowired
    ProdutoService produtoService;

    @GetMapping("/")
    public List<Produto> buscarTodos() {
        return produtoService.listalTodos();
    }

    @PostMapping("/")
    public Produto salvar(@RequestBody Produto object) {
        return produtoService.salvar(object);
    }

    @PutMapping("/")
    public Produto editar(@RequestBody Produto object) {
        return produtoService.editar(object);
    }

    @DeleteMapping
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        produtoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}