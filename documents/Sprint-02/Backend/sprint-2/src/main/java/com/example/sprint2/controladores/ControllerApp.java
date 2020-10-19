package com.example.sprint2.controladores;



import com.example.sprint2.dominios.Login;
import com.example.sprint2.dominios.Usuario;
import com.example.sprint2.dominios.UsuarioCadastro;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ControllerApp {
    private boolean estaLogado = false;
    private List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public ResponseEntity listarUsuario(){
        if (usuarios.isEmpty()){
            return ResponseEntity.status(204).build();
        }else{
            return ResponseEntity.ok(usuarios);
        }
    }
    @PostMapping
    public ResponseEntity cadastrarUsuario(@RequestBody UsuarioCadastro usuario){
        usuarios.add(usuario);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity recuperarUsuario(@PathVariable int id){
        if(usuarios.size() >= id){
            return ResponseEntity.ok(usuarios.get(id-1));
        }else {
            return ResponseEntity.status(404).build();
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity deletarUsuario(@PathVariable int id){
        if (usuarios.size() >= id){
            usuarios.remove(id-1);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.status(404).build();
        }
    }
    @PutMapping("/alterar/{id}")
    public void alterarUsuario(@PathVariable int id, @RequestBody Usuario usuario){
        usuarios.remove(id-1);
        usuarios.add(id-1, usuario);
    }

    @PostMapping("/login")
    public ResponseEntity loginUsuario(@RequestBody Login login) {
        for (Usuario usuario : usuarios){
            if (usuario.getEmail().equals(login.getEmail()) && usuario.getSenha().equals(login.getSenha())) {
                estaLogado = true;
                return ResponseEntity.ok().body(usuario);
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }

    @PostMapping("/logoff")
    public ResponseEntity logoffUsuario(@RequestBody Login login) {
        for (Usuario usuario : usuarios){
            if (usuario.getEmail().equals(login.getEmail()) && usuario.getSenha().equals(login.getSenha())) {
                estaLogado = false;
                return ResponseEntity.ok().body("O usuário foi deslogado!");
            }
        }
        return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}