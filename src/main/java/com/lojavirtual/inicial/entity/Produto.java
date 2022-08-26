package com.lojavirtual.inicial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "produto")
@Data
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "descricao_curta")
    private String descricaoCurta;

    @Column(name = "descricao_detalhada")
    private String cdescricaoDetalhada;

    @Column(name = "valor_custo")
    private String valorCusto;

    @Column(name = "valor_venda")
    private String valorVenda;

    @ManyToOne
    @JoinColumn(name = "idMarca")
    private Marca marca;

}
