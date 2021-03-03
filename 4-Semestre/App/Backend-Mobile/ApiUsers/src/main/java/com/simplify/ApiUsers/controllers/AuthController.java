package com.simplify.ApiUsers.controllers;

import com.simplify.ApiUsers.entities.Login;
import com.simplify.ApiUsers.entities.LoginTeacher;
import com.simplify.ApiUsers.entities.User;
import com.simplify.ApiUsers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    private Boolean isSignIn = false;

    @PostMapping
    public ResponseEntity auth(@RequestBody Login login){
        List<User> userList = userRepository.findAll();
        for (User u: userList){
            for (Integer i =0; i < userRepository.count();i++){
                if (u.getEmail().equals(login.getEmail()) && u.getSenha().equals(login.getPassword())){
                    return ResponseEntity.ok(this.isSignIn= true);
                }else{
                    return ResponseEntity.badRequest().body("Email ou senha invalidos, tente novamente");
                }
            }
        }
        return ResponseEntity.badRequest().body("Não Encontrados na nossa base de dados");
    }

    @PostMapping("/logoff")
    public ResponseEntity logout(){
        if (!this.isSignIn){
            return ResponseEntity.badRequest().body("Nenhum usuario logado para realizar logout");
        }else{
            this.isSignIn = false;
            return ResponseEntity.ok("Usuario Deslogado");
        }
    }

    @PostMapping("/teacher")
    public ResponseEntity authTeacher(@RequestBody LoginTeacher teacher){
        List<User> userList = userRepository.findAll();
        for (User u: userList){
            for (Integer i =0; i < userRepository.count();i++){
                if (u.getEmail().equals(teacher.getEmail()) && u.getSenha().equals(teacher.getPassword()) && u.getTeacher()){
                    return ResponseEntity.ok(this.isSignIn= true);
                }else{
                    if (!u.getTeacher()){
                        return ResponseEntity.badRequest().body("Perfil não possui permissão para este recurso");
                    }
                    else {return ResponseEntity.badRequest().body("Email ou senha invalidos, tente novamente");}
                }
            }
        }
        return ResponseEntity.badRequest().body("Não Encontrados na nossa base de dados");
    }
}
