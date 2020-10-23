package com.example.sprint2.dominios;

import javax.persistence.Column;
import javax.persistence.Entity;


public class UsuarioCadastro extends Usuario {

    private String nome;

    private String logradouro;

    private String cep;

    private String cpf;

    private String rg;

    private String estado;

    private String cidade;

    private String nacionalidade;


    public UsuarioCadastro(String email, String senha, int id, String nome, String logradouro,
                           String cep, String cpf, String rg, String estado, String cidade, String nacionalidade) {
        super(email, senha, id);
        this.nome = nome;
        this.logradouro = logradouro;
        this.cep = cep;
        this.cpf = cpf;
        this.rg = rg;
        this.estado = estado;
        this.cidade = cidade;
        this.nacionalidade = nacionalidade;
    }

    @Override
    public int analytics() {
        return getId();
    }

    public String getNome() {
        return nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCep() {
        return cep;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "UsuarioCadastro{" +
                "nome='" + nome + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                "} " + super.toString();
    }
}
