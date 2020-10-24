package com.example.sprint2.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Length(min=2, max = 30)
    private String Descricao;

    @NotNull
    @Length(min=4, max = 6)
    private boolean Presencial;

    @ManyToOne
    private Endereco endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean isPresencial() {
        return Presencial;
    }

    public void setPresencial(boolean presencial) {
        Presencial = presencial;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
