package com.simplify.api.controllers;


import com.simplify.api.pdf.GerarPDF;
import com.simplify.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("/teste")
public class TesteController
{
    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public ResponseEntity get(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/baixar")
    public void exportTOpdf(HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users.pdf";
        response.setHeader(headerKey,headerValue);
        GerarPDF gerarPDF = new GerarPDF();
        gerarPDF.export(response);
    }
}
