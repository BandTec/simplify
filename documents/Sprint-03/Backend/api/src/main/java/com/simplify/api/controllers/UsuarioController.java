package com.simplify.api.controllers;


import com.simplify.api.entities.Usuario;
import com.simplify.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public ResponseEntity getAll(){
        if (repository.count()>0){
            return ok(repository.findAll());
        } else{
            return noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity post(@RequestBody Usuario user){
        repository.save(user);
        return created(null).body(repository.save(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return notFound().build();
    }
    @GetMapping("/{id}")
    public ResponseEntity getId(@PathVariable Integer id){
        if (repository.existsById(id)){
            return ResponseEntity.ok(repository.findById(id));
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}
