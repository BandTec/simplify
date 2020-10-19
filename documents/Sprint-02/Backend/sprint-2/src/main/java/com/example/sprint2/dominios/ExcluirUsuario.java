package com.example.sprint2.dominios;

public class ExcluirUsuario extends UsuarioLogin{
    private int totalExclusao;

    public ExcluirUsuario(String email, String senha, int id, int totalExclusao) {
        super(email, senha, id);
        this.totalExclusao = totalExclusao;
    }
    public void excluirUsuario(){

    }
}
