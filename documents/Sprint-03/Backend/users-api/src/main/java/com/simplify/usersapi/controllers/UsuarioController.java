package com.simplify.usersapi.controllers;


import com.simplify.usersapi.entities.Login;
import com.simplify.usersapi.entities.Usuario;
import com.simplify.usersapi.entregaveis.FilaObj;
import com.simplify.usersapi.entregaveis.PilhaObj;
import com.simplify.usersapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    PilhaObj<Usuario> aux = new PilhaObj<>(10);
    FilaObj<UUID> filaUUID = new FilaObj<>(10);
    Map<UUID, List<Usuario>> reqFeitas = new HashMap<>();

    @Autowired
    UsuarioRepository repository;

    Boolean isSignin = false;

    @GetMapping
    public ResponseEntity getAll(){
        UUID identificador = UUID.randomUUID();
        filaUUID.insert(identificador);
        return accepted()
                .header("identificador", identificador.toString())
                .build();

    }
    @Scheduled(fixedDelay = 30000)
    public void executarScheduler() {
        if (!filaUUID.isEmpty()) {
            UUID id = filaUUID.poll();
            if (repository.count() > 0) {
                //repository.findAll();
                reqFeitas.put(id, repository.findAll());
                System.out.println("FEITO  " + id);
            }
        }
    }
    @GetMapping("/resultado/{identificador}")
    public  ResponseEntity resultado(@PathVariable String identificador){
        UUID identificadorObj = UUID.fromString(identificador);
        if(reqFeitas.containsKey(identificadorObj)){
            return ok(reqFeitas.get(identificadorObj));
        }else{
            return notFound().build();
        }
    }
    @PostMapping("/cadastro/pilha")
    public ResponseEntity postPilha(@RequestBody Usuario user){
        aux.push(user);
        repository.save(user);
        return created(null).build();
    }

    @DeleteMapping("/apagar/pilha")
    public ResponseEntity deletePilha(@PathVariable Integer id){
        if (!aux.isEmpty()){
            Usuario usu = aux.pop();
            repository.deleteById(usu.getId());
            return ok().build();
        } else {
            return noContent().build();
        }
    }
    @PostMapping("/cadastro")
    public ResponseEntity post(@RequestBody Usuario user) {
            repository.save(user);
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

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody Login login){
        List<Usuario> users = repository.findAll();
        for (Usuario user: users){
            for (Integer i = 0; i < repository.count();i++){
                if (user.getEmail().equals(login.getEmail()) && user.getPassword().equals(login.getSenha())){
                    this.isSignin =true;
                    return ok(user.getId());
                }
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    @GetMapping("/verificar")
    public ResponseEntity hasSignIn(){
        if (this.isSignin){
            return ok(true);
        }else{
            return noContent().build();
        }
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
