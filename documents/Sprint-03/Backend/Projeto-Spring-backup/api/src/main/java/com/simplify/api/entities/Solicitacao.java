package com.simplify.api.entities;

import javax.persistence.*;
import java.util.List;

@Entity(name = "solicita")
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "agendamento")
    private String dataAgendamento;

    @OneToMany
    private List<ImgsDocs> documentos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

}
