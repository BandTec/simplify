package br.com.bandtec.apiservicos.entities;

import javax.persistence.*;

@Entity
public class ImgsDocs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDocumento;

    private String tipoDocumento;

    private String urlUpload;

    @ManyToOne
    private Solicitacao solicitacao;

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getUrlUpload() {
        return urlUpload;
    }

    public void setUrlUpload(String urlUpload) {
        this.urlUpload = urlUpload;
    }

    public Solicitacao getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Solicitacao solicitacao) {
        this.solicitacao = solicitacao;
    }
}
