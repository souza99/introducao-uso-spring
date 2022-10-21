package com.lojavirtual.inicial.dto;

import org.springframework.beans.BeanUtils;

import com.lojavirtual.inicial.entity.Pessoa;

import lombok.Data;

@Data
public class PessoaClienteRequestDTO {
    
    private String nome;

    private String cpf;

    private String email;

    private String endereco;

    private String cep;

    private String cidade;

    public Pessoa converte(PessoaClienteRequestDTO pessoaClienteRequestDTO) {
        Pessoa pessoa = new Pessoa();
        BeanUtils.copyProperties(pessoaClienteRequestDTO, pessoa);
        return pessoa;
    }
}
