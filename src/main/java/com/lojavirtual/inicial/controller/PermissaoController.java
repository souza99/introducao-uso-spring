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

import com.lojavirtual.inicial.entity.Permissao;
import com.lojavirtual.inicial.service.PermissaoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/permissao")
public class PermissaoController {

    @Autowired
    private PermissaoService permissaoService;

    @GetMapping("/")
    public List<Permissao> buscarTodos() {
        return permissaoService.buscartodas();
    }

    @PostMapping("/")
    public Permissao salvar(@RequestBody Permissao object) {
        return permissaoService.salvar(object);
    }

    @PutMapping("/")
    public Permissao editar(@RequestBody Permissao object) {
        return permissaoService.editar(object);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id) {
        permissaoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
