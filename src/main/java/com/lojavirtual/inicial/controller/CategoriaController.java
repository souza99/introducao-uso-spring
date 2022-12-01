package com.lojavirtual.inicial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojavirtual.inicial.entity.Categoria;
import com.lojavirtual.inicial.service.CategoriaService;


@RestController
@RequestMapping("api/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/")
    public List<Categoria> buscarTodas() {
        return categoriaService.buscarTodas();
    }

    @PostMapping("/")
    public Categoria salvar(@RequestBody Categoria object) {
        return categoriaService.salvar(object);
    }

    @PutMapping("/")
    public Categoria editar(@RequestBody Categoria object) {
        return categoriaService.editar(object);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        categoriaService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
