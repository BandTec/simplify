package com.bandtec.simplify.simplifyApi.entities;


import javax.persistence.*;

@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_service;

    private Boolean presencial;

    private String descricao;

    @ManyToOne
    private Usuario usuario;

    @OneToOne
    private Agendamento agendamento;

    @OneToOne
    private Pagamento pagamento;


    //Getters and setters


    public Integer getId_service() {
        return id_service;
    }

    public void setId_service(Integer id_service) {
        this.id_service = id_service;
    }

    public Boolean getPresencial() {
        return presencial;
    }

    public void setPresencial(Boolean presencial) {
        this.presencial = presencial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
