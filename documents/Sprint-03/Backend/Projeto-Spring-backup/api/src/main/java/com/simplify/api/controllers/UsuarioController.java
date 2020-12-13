package com.simplify.api.controllers;


import com.simplify.api.entities.ListaObj;
import com.simplify.api.entities.Login;
import com.simplify.api.entities.Usuario;
import com.simplify.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    private boolean estaLogado = false;

    @Autowired
    private UsuarioRepository repository;

    Integer tamanho =10;
    ListaObj<Usuario> postLista = new ListaObj<>(tamanho);
    ListaObj<Usuario> exportLista = new ListaObj<>(tamanho);

    @GetMapping
    public ResponseEntity getAll(){
        if (repository.count()>0){
            return ok(repository.findAll());
        } else{
            return noContent().build();
        }
    }

//    @PostMapping
//    public ResponseEntity post(@RequestBody Usuario user){
//        repository.save(user);
//        return created(null).body(repository.save(user));
//    }

    @PostMapping
    public ResponseEntity postUser(@RequestBody Usuario u){
        if (postLista.getNroElem() < this.tamanho){  //Se a lista entregaveis Post estiver com espaço ela vai adcionar o usuario
            postLista.adiciona(u);
            for (Integer i= 0; i<postLista.getTamanho();i++){ // após adcionar ele faz um for percorrendo a lista OBj e adcionando no  repository
                repository.save(postLista.getElemento(i));
            }
            postLista.limpa(); //depois de adcionar ele limpa a lista
            return ResponseEntity.created(null).build();
        }else{
            return ResponseEntity.badRequest().build();
        }
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

    @PostMapping("/login")
    public ResponseEntity loginUsuario(@RequestBody Login login) {
        List<Usuario> user = repository.findAll();
        for (Usuario cliente : user){
            for (Integer i = 0;i <repository.count(); i++){
                if (cliente.getEmail().equals(login.getEmail()) && cliente.getSenha().equals(login.getSenha())){
                    estaLogado = true;
                    return ResponseEntity.ok().body(cliente);
                }
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    @PostMapping("/logoff")
    public ResponseEntity logoffUsuario(@RequestBody Login login) {
        List<Usuario> user = repository.findAll();
        for (Usuario cliente : user){
            for (Integer i = 0;i <repository.count(); i++){
                if (cliente.getEmail().equals(login.getEmail()) && cliente.getSenha().equals(login.getSenha())){
                    estaLogado = false;
                    return ResponseEntity.ok().body("O usuário foi deslogado!");
                }
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}
