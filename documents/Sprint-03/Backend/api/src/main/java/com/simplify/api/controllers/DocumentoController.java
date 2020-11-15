package com.simplify.api.controllers;


import com.simplify.api.entities.documents.CPF;
import com.simplify.api.entities.documents.RG;
import com.simplify.api.repositories.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/doc")
public class DocumentoController {

    @Autowired
    private DocumentoRepository repository;

    @GetMapping
    public ResponseEntity get() {
        if (repository.count() > 0) {
            return ok(repository.findAll());
        } else {
            return noContent().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Integer id) {
        if (repository.count() > 0) {
            if (repository.existsById(id)) {
                return ok(repository.findById(id));
            } else {
                return badRequest().build();
            }
        } else {
            return noContent().build();
        }
    }
}