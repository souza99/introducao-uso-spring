package com.lojavirtual.inicial.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lojavirtual.inicial.entity.Permissao;
import com.lojavirtual.inicial.repository.PermissaoRepository;

@Service
public class PermissaoService {
    
    @Autowired
    PermissaoRepository permissaoRepository;

    public List<Permissao> buscartodas() {
        return permissaoRepository.findAll();
    }

    public Permissao salvar(Permissao object) {
        object.setDataCriacao(new Date());
        Permissao newObject = permissaoRepository.saveAndFlush(object);
        return newObject;
    }

    public Permissao editar(Permissao object) {
        object.setDataAtualizacao(new Date());
        Permissao returnObject = permissaoRepository.saveAndFlush(object);
        return returnObject;
    }

    public void deletar(Long id) {
        Permissao object = permissaoRepository.findById(id).get();
        permissaoRepository.delete(object);
    }
}
