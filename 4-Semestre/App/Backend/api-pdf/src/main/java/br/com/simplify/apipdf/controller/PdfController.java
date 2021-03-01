package br.com.simplify.apipdf.controller;


import br.com.simplify.apipdf.geraPdf.CertidaoNascimento;
import br.com.simplify.apipdf.geraPdf.RG;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/pdf")
public class PdfController {

    @GetMapping("/certidao")
    public void exportTOpdf(HttpServletResponse response) throws IOException {
        CertidaoNascimento gerarPDF = new CertidaoNascimento();
        response.setContentType("application/pdf");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename= certidao-nascimento"+ gerarPDF.getProtocolinho()+".pdf";
        response.setHeader(headerKey,headerValue);

        gerarPDF.export(response);
    }

    @GetMapping("/rg")
    public void exportTOpdfRg(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users.pdf";
        response.setHeader(headerKey,headerValue);
        RG gerarPDF = new RG();
        gerarPDF.export(response);
    }
}
