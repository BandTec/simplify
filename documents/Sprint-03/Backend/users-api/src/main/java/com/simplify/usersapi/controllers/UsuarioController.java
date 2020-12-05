package com.simplify.usersapi.controllers;


import com.simplify.usersapi.entities.Login;
import com.simplify.usersapi.entities.Usuario;
import com.simplify.usersapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    Boolean isSignin = false;

    @GetMapping
    public ResponseEntity getAll(){
        if(repository.count() > 0){
            return ok().body(repository.findAll());
        }else{
            return noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity post(@RequestBody Usuario user){
        if (user == null){
            return badRequest().build();
        }else{
            repository.save(user);
            return created(null).build();
        }
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

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody Login login){
        List<Usuario> users = repository.findAll();
        for (Usuario user: users){
            for (Integer i = 0; i < repository.count();i++){
                if (user.getEmail().equals(login.getEmail()) && user.getPassword().equals(login.getSenha())){
                    return ok(isSignin = true);
                }
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    @PostMapping("/logoff")
    public ResponseEntity logoff(@RequestBody Login login){
        List<Usuario> users = repository.findAll();
        for (Usuario user: users){
            for (Integer i = 0; i < repository.count();i++){
                if (user.getEmail().equals(login.getEmail()) && user.getPassword().equals(login.getSenha())){
                    return ok(isSignin = false);
                }
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}
