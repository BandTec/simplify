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
    @Length(min=2, max = 3)
    private String Online;

    @NotNull
    @Length(min=2, max = 3)
    private String Presencial;

    @ManyToOne
    private Endereco endereco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOnline() {
        return Online;
    }

    public void setOnline(String online) {
        Online = online;
    }

    public String getPresencial() {
        return Presencial;
    }

    public void setPresencial(String presencial) {
        Presencial = presencial;
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
