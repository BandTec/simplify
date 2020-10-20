package com.example.sprint2.entity;

import javax.persistence.*;

@Entity(name = "usuario")
public class User { //Entidade forte

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="NAME",length = 35,nullable = true)
    private String nome;

    @Column(name="EMAIL",length = 35,nullable = true)
    private String email;

    @Column(name="TELEFONE",length = 20,nullable = true)
    private Integer telefone;

    @Column(name="SENHA",length = 35,nullable = true)
    private String senha;

    @ManyToOne
    private Dados dados;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


}
