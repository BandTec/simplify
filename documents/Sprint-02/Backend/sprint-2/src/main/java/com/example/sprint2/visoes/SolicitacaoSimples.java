package com.example.sprint2.visoes;

public class SolicitacaoSimples {

    private Integer id;

    private String Descricao;

    private String Online;

    private String Presencial;

    public SolicitacaoSimples(Integer id, String descricao, String online, String presencial) {
        this.id = id;
        Descricao = descricao;
        Online = online;
        Presencial = presencial;
    }

    public Integer getId() {
        return id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getOnline() {
        return Online;
    }

    public String getPresencial() {
        return Presencial;
    }
}
