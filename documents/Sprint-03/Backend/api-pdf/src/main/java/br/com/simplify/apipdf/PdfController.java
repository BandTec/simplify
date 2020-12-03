package br.com.simplify.apipdf;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/pdf")
public class PdfController {

    @GetMapping("/baixar")
    public void exportTOpdf(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users.pdf";
        response.setHeader(headerKey,headerValue);
        PdfCertidaoNascimento gerarPDF = new PdfCertidaoNascimento();
        gerarPDF.export(response);
    }


}
