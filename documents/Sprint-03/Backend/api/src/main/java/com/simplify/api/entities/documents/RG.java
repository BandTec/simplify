package com.simplify.api.entities.documents;

public class RG {
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
