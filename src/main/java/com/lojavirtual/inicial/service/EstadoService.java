package com.lojavirtual.inicial.service;

import com.lojavirtual.inicial.entity.Estado;
import com.lojavirtual.inicial.repository.EstadoRepository;
import org.jboss.jandex.Index;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public List<Estado> buscarTodos() {
        return estadoRepository.findAll();
    }

    public Estado salvar(Estado estado) {
        estado.setDataCadastro(new Date());
        Estado novoEstado = estadoRepository.saveAndFlush(estado);
        return novoEstado;
    }

    public Estado editar(Estado estado) {
        estado.setDataAtualizacao(new Date());
        return estadoRepository.saveAndFlush(estado);
    }

    public void deletar(Long id) {
        Estado estado = estadoRepository.findById(id).get();
        estadoRepository.delete(estado);
    }

}
