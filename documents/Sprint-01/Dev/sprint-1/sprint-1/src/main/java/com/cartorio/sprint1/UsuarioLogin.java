package com.cartorio.sprint1;

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
