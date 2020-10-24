package com.example.sprint2.visoes;

public class SolicitacaoSimples {

    private Integer id;

    private String Descricao;

    private boolean Presencial;

    public SolicitacaoSimples(Integer id, String descricao, boolean presencial) {
        this.id = id;
        Descricao = descricao;
        Presencial = presencial;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public boolean isPresencial() {
        return Presencial;
    }

    public void setPresencial(boolean presencial) {
        Presencial = presencial;
    }
}
