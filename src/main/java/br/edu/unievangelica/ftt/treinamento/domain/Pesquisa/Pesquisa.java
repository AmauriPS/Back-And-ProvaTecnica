package br.edu.unievangelica.ftt.treinamento.domain.Pesquisa;

import br.edu.unievangelica.ftt.treinamento.core.entity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Pesquisa")
@Getter
@Setter
@ToString

public class Pesquisa extends AbstractEntity {


    @Column(name = "Descricao", nullable = false)
    private String descricao;

    @Column(name = "Sigla",nullable = false)
    private String sigla;

    @Column(name = "email",nullable = false )
    private String email;

    @Column(name = "url",nullable = false )
    private String url;

    @Column(name = "estatus",nullable = false )
    private String status;

}
