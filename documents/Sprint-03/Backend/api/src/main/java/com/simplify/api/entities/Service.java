package com.simplify.api.entities;


import javax.persistence.*;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String descricao;

    private String documentos;

    @Column(name = "presencial")
    private Boolean isPresencial;

    @ManyToOne
    @JoinColumn(name="teste", nullable=false)
    private Solicitacao solicita;

    public Integer getId() {
        return id;
    }

    public Solicitacao getSolicitacao() {
        return solicita;
    }

    public void setSolicita(Solicitacao solicita) {
        this.solicita = solicita;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    public Boolean getPresencial() {
        return isPresencial;
    }

    public void setPresencial(Boolean presencial) {
        isPresencial = presencial;
    }
}
