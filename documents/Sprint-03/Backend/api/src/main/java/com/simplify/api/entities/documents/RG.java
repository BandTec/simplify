package com.simplify.api.entities.documents;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RG {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;


    private String RegistroGeral;
    private String nome;
    private String orgaoEmissor;

    public String getRegistroGeral() {
        return RegistroGeral;
    }

    public void setRegistroGeral(String registroGeral) {
        RegistroGeral = registroGeral;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }
}
