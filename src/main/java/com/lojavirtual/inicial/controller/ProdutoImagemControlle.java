package com.lojavirtual.inicial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lojavirtual.inicial.entity.ProdutoImagem;
import com.lojavirtual.inicial.service.ProdutoImagemService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/produtoImagem")
public class ProdutoImagemControlle {

    @Autowired
    private ProdutoImagemService produtoImagemService;

    @GetMapping("/")
    public List<ProdutoImagem> buscarTodos() {
        return produtoImagemService.buscarTodos();
    }

    @PostMapping("/")
    public ProdutoImagem salvar(@RequestParam("idProduto") Long idProduto, @RequestParam("file") MultipartFile file) {
        return produtoImagemService.salvar(idProduto, file);
    }
}
