package com.simplify.usersapi.controllers;

import com.simplify.usersapi.entities.Cartorio;
import com.simplify.usersapi.entities.Usuario;
import com.simplify.usersapi.repositories.CartorioRepository;
import com.simplify.usersapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/cartorio")
public class CartorioController {

    @Autowired
    CartorioRepository repository;

    @PostMapping("/cadastrar")
    public ResponseEntity post(@RequestBody Cartorio cartorio){
        repository.save(cartorio);
        return created(null).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Integer id){
        if (repository.existsById(id)){
            return ok(repository.findById(id));
        }else{
            return noContent().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return ok().build();
        }else {
            return noContent().build();
        }
    }
}
