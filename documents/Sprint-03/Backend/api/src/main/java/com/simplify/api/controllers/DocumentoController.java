package com.simplify.api.controllers;


import com.simplify.api.entities.documents.CPF;
import com.simplify.api.entities.documents.Comprovante;
import com.simplify.api.entities.documents.RG;
import com.simplify.api.repositories.ComprovanteRepositoruy;
import com.simplify.api.repositories.CpfRepository;
import com.simplify.api.repositories.DocumentoRepository;
import com.simplify.api.repositories.RgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/doc")
public class DocumentoController {

    @Autowired
    private DocumentoRepository repository;

    @Autowired
    private RgRepository rgRepository;

    @Autowired
    private CpfRepository cpfRepository;

    @Autowired
    ComprovanteRepositoruy comprovanteRepositoruy;

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
    @PostMapping("/rg")
    public ResponseEntity postRg(@RequestBody RG rg){
        rgRepository.save(rg);
        return ResponseEntity.created(null).build();
    }

    @PostMapping("/cpf")
    public ResponseEntity PostCPF(@RequestBody CPF cpf){
        cpfRepository.save(cpf);
        return ResponseEntity.created(null).build();
    }
    @PostMapping("/comprovante")
    public ResponseEntity postComprovante(@RequestBody Comprovante comprovante){
        comprovanteRepositoruy.save(comprovante);
        return ResponseEntity.created(null).build();
    }
}