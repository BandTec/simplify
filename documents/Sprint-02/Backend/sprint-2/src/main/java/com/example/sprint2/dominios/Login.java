package com.example.sprint2.dominios;

public class Login {
    private String CPF;
    private String senha;

    public Login(String CPF, String senha) {
        this.CPF = CPF;
        this.senha = senha;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}