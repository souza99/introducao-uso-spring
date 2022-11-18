package com.lojavirtual.inicial.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lojavirtual.inicial.entity.Produto;
import com.lojavirtual.inicial.entity.ProdutoImagens;
import com.lojavirtual.inicial.repository.ProdutoImagensRepository;
import com.lojavirtual.inicial.repository.ProdutoRepository;

@Service
public class ProdutoImagemService {

    @Autowired
    private ProdutoImagensRepository produtoImagemRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoImagens> buscarTodos() {
        return produtoImagemRepository.findAll();
    }

    public ProdutoImagens salvar(Long idProduto, MultipartFile file) {
        Produto produto = produtoRepository.findById(idProduto).get();
        ProdutoImagens object = new ProdutoImagens();

        try {

            if (!file.isEmpty()) {
                byte[] bytes = file.getBytes();
                String nomeImagem = String.valueOf(produto.getId()) + file.getOriginalFilename();
                Path caminho = Paths.get("c:/imagens/" + nomeImagem);
                Files.write(caminho, bytes);
                object.setNome(nomeImagem);
            }

        } catch(IOException e) {
            e.printStackTrace();
        }

        object.setProduto(produto);
        object.setDataCadastro(new Date());
        object = produtoImagemRepository.saveAndFlush(object);
        return object;
    }


    public ProdutoImagens editar(ProdutoImagens object) {
        object.setDataAtualizacao(new Date());
        return produtoImagemRepository.saveAndFlush(object);
    }

    public void deletar(Long id) {
        ProdutoImagens object = produtoImagemRepository.findById(id).get();
        produtoImagemRepository.delete(object);
    }

}
