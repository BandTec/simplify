package com.cartorio.sprint1;

public abstract class Usuario {
    private String email;
    private String senha;
    private int id;

    public Usuario(String email, String senha, int id) {
        this.email = email;
        this.senha = senha;
        this.id = id;
    }

    public abstract int analytics();



    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", id=" + id +
                '}';
    }
}
