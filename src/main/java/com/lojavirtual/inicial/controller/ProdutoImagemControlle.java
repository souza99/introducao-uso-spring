package com.lojavirtual.inicial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.lojavirtual.inicial.entity.ProdutoImagens;
import com.lojavirtual.inicial.service.ProdutoImagemService;

@RestController
@RequestMapping("api/produtoImagem")
public class ProdutoImagemControlle {

    @Autowired
    private ProdutoImagemService produtoImagemService;

    @GetMapping("/")
    public List<ProdutoImagens> buscarTodos() {
        return produtoImagemService.buscarTodos();
    }

    @PostMapping("/")
    public ProdutoImagens salvar(@RequestParam("idProduto") Long idProduto, @RequestParam("file") MultipartFile file) {
        return produtoImagemService.salvar(idProduto, file);
    }

    @PutMapping("/")
    public ProdutoImagens editar(@RequestBody ProdutoImagens object) {
        return produtoImagemService.editar(object);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
        produtoImagemService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
