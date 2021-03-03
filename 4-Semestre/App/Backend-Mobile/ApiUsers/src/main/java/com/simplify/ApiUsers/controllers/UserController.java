package com.simplify.ApiUsers.controllers;

import com.simplify.ApiUsers.entities.User;
import com.simplify.ApiUsers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity getAll(){
        if (userRepository.count() > 0)
        return ResponseEntity.ok(userRepository.findAll());
        else return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity postUser(@RequestBody User u){
        u.setRa(new Random().nextInt(10000) + 1);
        userRepository.save(u);
        return ResponseEntity.ok(userRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity getbyId(@RequestParam Integer id){
        if(userRepository.existsById(id)){
                return ResponseEntity.ok(userRepository.findById(id));
        }
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@RequestParam Integer id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/upload")
    public ResponseEntity postDocument(){
        return ResponseEntity.ok().build();
    }

}
