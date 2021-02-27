package com.simplify.usersapi.controllers;

import com.simplify.usersapi.entities.Login;
import com.simplify.usersapi.entities.Professor;
import com.simplify.usersapi.repositories.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/cartorio")
public class ProfessorController {

    @Autowired
    ProfessorRepository repository;

    Boolean isSignin = false;

    @PostMapping("/cadastrar")
    public ResponseEntity post(@RequestBody Professor professor){
        repository.save(professor);
        return created(null).build();
    }

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody Login login){
        List<Professor> cartorios = repository.findAll();
        for (Professor cart : cartorios){
            for (Integer i = 0; i < repository.count();i++){
                if (cart.getEmail().equals(login.getEmail()) && cart.getSenha().equals(login.getSenha())){
                    this.isSignin = true;
                    return ok(cart.getId());
                }
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    @PostMapping("/logoff")
    public ResponseEntity logoff(@RequestBody Login login){
        List<Professor> cartorios = repository.findAll();
        for (Professor cart : cartorios){
            for (Integer i = 0; i < repository.count();i++){
                if (cart.getEmail().equals(login.getEmail()) && cart.getSenha().equals(login.getSenha())){
                    return ok(isSignin = false);
                }
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable Integer id){
        if (repository.existsById(id)){
            return ok(repository.findById(id));
        } else {
            return noContent().build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id){
        if (repository.existsById(id)){
            repository.deleteById(id);
            return ok().build();
        } else {
            return noContent().build();
        }
    }
}
