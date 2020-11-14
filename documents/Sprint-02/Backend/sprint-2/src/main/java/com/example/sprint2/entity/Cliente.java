package com.example.sprint2.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente { //Entidade forte

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Length(min=2, max = 35)
    private String nome;

    @NotNull
    @Length(min=2, max = 35)
    private String sobrenome;

    @NotNull
    @Length(min=2, max = 35)
    private String dataNascimento;

    @NotNull
    @Length(min=2, max = 35)
    private String email;

    @NotNull
    @Length(min=2, max = 15)
    private String telefone;

    @NotNull
    @Length(min=2, max = 20)
    private String senha;

    @NotNull
    @Length(min=10, max = 11)
    private String cpf;

    @NotNull
    @Length(min=7, max = 13)
    private String rg;

    @NotNull
    @Length(min =6, max = 15)
    private String cep;

    @NotNull
    @Length(min =3, max = 40)
    private String cidade;

    @NotNull
    @Length(min =2, max = 20)
    private String estado;

    @NotNull
    @Length(min =2, max = 40)
    private String logradouro;

    @NotNull
    @Length(min =1, max = 6)
    private String numero;

    public Integer getId() {
        return id;
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

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
