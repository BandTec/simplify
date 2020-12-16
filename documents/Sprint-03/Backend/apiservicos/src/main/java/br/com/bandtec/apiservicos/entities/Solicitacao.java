package br.com.bandtec.apiservicos.entities;

import br.com.bandtec.apiservicos.entities.ImgsDocs;

import javax.persistence.*;
import java.util.List;

@Entity
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String data;

    private String hora;

    private Integer id_usuario;

    @OneToMany
    private List<ImgsDocs> documentos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDataAgendamento() {
        return data;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.data = dataAgendamento;
    }

    public String getHora() {
        return hora;
    }

    public List<ImgsDocs> getDocumentos() {
        return documentos;
    }
}