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

import com.lojavirtual.inicial.entity.Pessoa;
import com.lojavirtual.inicial.service.PessoaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {
    
    @Autowired
    PessoaService pessoaService;

    @GetMapping("/")
    public List<Pessoa> buscarTodos() {
        return pessoaService.buscartodas();
    }

    @PostMapping("/")
    public Pessoa salvar(@RequestBody Pessoa object) {
        return pessoaService.salvar(object);
    }

    @PutMapping("/")
    public Pessoa editar(@RequestBody Pessoa object) {
        return pessoaService.editar(object);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        pessoaService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
