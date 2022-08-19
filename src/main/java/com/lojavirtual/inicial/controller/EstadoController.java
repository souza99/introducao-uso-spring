package com.lojavirtual.inicial.controller;

import com.lojavirtual.inicial.entity.Estado;
import com.lojavirtual.inicial.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/estado/")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    public List<Estado> buscarTodos() {

    }

    public Estado salvar(Estado estado) {

    }

    public Estado editar(Estado estado) {

    }

    public ResponseEntity<Void> excluir(Long id) {

    }

}
