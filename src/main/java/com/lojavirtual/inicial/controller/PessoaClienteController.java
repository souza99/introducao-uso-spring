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

import com.lojavirtual.inicial.dto.PessoaClienteRequestDTO;
import com.lojavirtual.inicial.entity.Permissao;
import com.lojavirtual.inicial.entity.Pessoa;
import com.lojavirtual.inicial.service.PermissaoService;
import com.lojavirtual.inicial.service.PessoaService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/cliente")
public class PessoaClienteController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/")
    public Pessoa salvar(@RequestBody PessoaClienteRequestDTO object) {
        Pessoa pessoa = new PessoaClienteRequestDTO().converte(object);
        return pessoaService.salvar(pessoa);
    }

}
