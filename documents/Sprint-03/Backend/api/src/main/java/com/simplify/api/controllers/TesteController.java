package com.simplify.api.controllers;


import com.simplify.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
