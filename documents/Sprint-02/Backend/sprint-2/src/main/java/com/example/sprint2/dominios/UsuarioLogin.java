package com.example.sprint2.dominios;

public class UsuarioLogin extends Usuario {
    public UsuarioLogin(String email, String senha, int id) {
        super(email, senha, id);
    }

    @Override
    public int analytics() {
        return getId();
    }

    @Override
    public String toString() {
        return "UsuarioLogin{} " + super.toString();
    }
}
