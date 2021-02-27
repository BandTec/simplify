package com.simplify.usersapi.entities;


import javax.persistence.*;

@Entity
public class Estudante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private String sobrenome;

    @Column(name = "data")
    private String dataNascimento;

    private String email;

    private String senha;

    private String rg;

    private String cpf;

    private String certConclusao;

    private String comprovaEndereco;

    private String fotoTresPorQuatro;

    private String dadosResponsaveis;

    private String reservista;

    public Estudante(Integer id, String nome, String sobrenome, String dataNascimento, String email, String senha, String rg, String cpf, String certConclusao, String comprovaEndereco, String fotoTresPorQuatro, String dadosResponsaveis, String reservista) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.rg = rg;
        this.cpf = cpf;
        this.certConclusao = certConclusao;
        this.comprovaEndereco = comprovaEndereco;
        this.fotoTresPorQuatro = fotoTresPorQuatro;
        this.dadosResponsaveis = dadosResponsaveis;
        this.reservista = reservista;
    }

    public Estudante() {
    }

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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCertConclusao() {
        return certConclusao;
    }

    public void setCertConclusao(String certConclusao) {
        this.certConclusao = certConclusao;
    }

    public String getComprovaEndereco() {
        return comprovaEndereco;
    }

    public void setComprovaEndereco(String comprovaEndereco) {
        this.comprovaEndereco = comprovaEndereco;
    }

    public String getFotoTresPorQuatro() {
        return fotoTresPorQuatro;
    }

    public void setFotoTresPorQuatro(String fotoTresPorQuatro) {
        this.fotoTresPorQuatro = fotoTresPorQuatro;
    }

    public String getDadosResponsaveis() {
        return dadosResponsaveis;
    }

    public void setDadosResponsaveis(String dadosResponsaveis) {
        this.dadosResponsaveis = dadosResponsaveis;
    }

    public String getReservista() {
        return reservista;
    }

    public void setReservista(String reservista) {
        this.reservista = reservista;
    }
}
