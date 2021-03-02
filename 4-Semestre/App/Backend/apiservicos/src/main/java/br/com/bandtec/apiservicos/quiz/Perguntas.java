package br.com.bandtec.apiservicos.quiz;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Perguntas {
    @Id
    private Integer idPergunta;
    private String pergunta;
    private String respostas1;
    private String respostas2;
    private String respostas3;
    private String respostas4;
    private String respostas5;
    private String respostaCerta;



    public String getRespostas1() {
        return respostas1;
    }

    public void setRespostas1(String respostas1) {
        this.respostas1 = respostas1;
    }

    public String getRespostas2() {
        return respostas2;
    }

    public void setRespostas2(String respostas2) {
        this.respostas2 = respostas2;
    }

    public String getRespostas3() {
        return respostas3;
    }

    public void setRespostas3(String respostas3) {
        this.respostas3 = respostas3;
    }

    public String getRespostas4() {
        return respostas4;
    }

    public void setRespostas4(String respostas4) {
        this.respostas4 = respostas4;
    }

    public String getRespostas5() {
        return respostas5;
    }

    public void setRespostas5(String respostas5) {
        this.respostas5 = respostas5;
    }

    public Integer getIdPergunta() {
        return idPergunta;
    }

    public void setIdPergunta(Integer idPergunta) {
        this.idPergunta = idPergunta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }


    public String getRespostaCerta() {
        return respostaCerta;
    }

    public void setRespostaCerta(String respostaCerta) {
        this.respostaCerta = respostaCerta;
    }
}
