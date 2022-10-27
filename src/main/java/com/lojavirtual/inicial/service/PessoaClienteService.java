package com.lojavirtual.inicial.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.inicial.dto.PessoaClienteRequestDTO;
import com.lojavirtual.inicial.entity.Pessoa;
import com.lojavirtual.inicial.repository.PessoaClienteRepository;

@Service
public class PessoaClienteService {
    
    @Autowired
    private PessoaClienteRepository pessoaRepository;

    @Autowired
    private PermissaoPessoaService permissaoPessoaService;

    public Pessoa salvar(PessoaClienteRequestDTO pessoaDto) {
        Pessoa object = new PessoaClienteRequestDTO().converter(pessoaDto);
        object.setDataCriacao(new Date());
        Pessoa newObject = pessoaRepository.saveAndFlush(object);
        permissaoPessoaService.vincularPessoaPermissaoCliente(newObject);
        return newObject;
    }

}
