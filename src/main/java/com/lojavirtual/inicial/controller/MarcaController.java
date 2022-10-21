package com.lojavirtual.inicial.controller;


import io.swagger.v3.oas.annotations.parameters.RequestBody;

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

import com.lojavirtual.inicial.entity.Marca;
import com.lojavirtual.inicial.service.MarcaService;

@RestController
@RequestMapping("api/marca")
public class MarcaController {
    
    @Autowired
    private MarcaService marcaService;

    @GetMapping("/")
    public List<Marca> buscarTodos() {
        return marcaService.buscarTodos();
    }

    @PostMapping("/")
    public Marca salvar(@RequestBody Marca object) {
        return marcaService.salvar(object);
    }

    @PutMapping("/")
    public Marca editar(@RequestBody Marca object) {
        return marcaService.editar(object);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        marcaService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
