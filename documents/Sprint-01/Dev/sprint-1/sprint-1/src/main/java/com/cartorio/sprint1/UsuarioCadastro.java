package com.cartorio.sprint1;

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
