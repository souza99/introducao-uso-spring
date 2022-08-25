package com.lojavirtual.inicial.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cidade")
@Data
public class Cidade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAtualizacao;
}
