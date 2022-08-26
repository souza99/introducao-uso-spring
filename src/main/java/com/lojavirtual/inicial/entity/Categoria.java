package com.lojavirtual.inicial.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Table(name = "categoria")
@Data
public class Categoria {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
}
