package com.simplify.api.entities;

import com.simplify.api.entities.documents.CPF;
import com.simplify.api.entities.documents.Comprovante;
import com.simplify.api.entities.documents.RG;

import javax.persistence.*;

@Entity
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private CPF cpf;

    @ManyToOne
    private RG rg;

    @ManyToOne
    private Comprovante comprovante;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public RG getRg() {
        return rg;
    }

    public void setRg(RG rg) {
        this.rg = rg;
    }

    public Comprovante getComprovante() {
        return comprovante;
    }

    public void setComprovante(Comprovante comprovante) {
        this.comprovante = comprovante;
    }
}
