package com.simplify.api.entities.documents;

import com.simplify.api.entities.Documento;

import javax.persistence.*;
import java.util.List;

@Entity
public class CPF {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String CPF;

    @OneToMany
    private List<Documento> documentos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
