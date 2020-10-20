package com.example.sprint2.controladores;

import com.example.sprint2.dominios.ListaObj;
import com.example.sprint2.dominios.Usuario;
import com.example.sprint2.entity.User;
import com.example.sprint2.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;

@RestController
@RequestMapping("/users")
public class ControllerORM {

    @Autowired
    private UsuarioRepository usuarioRepository;

    Integer tamanho =10;
    ListaObj<User> postLista = new ListaObj<>(tamanho);
        ListaObj<User> exportLista = new ListaObj<>(tamanho);

    @GetMapping
    public ResponseEntity getAll(){
        if (usuarioRepository.count() > 0){
            return ResponseEntity.ok().body(usuarioRepository.findAll());
        }else{
            return ResponseEntity.noContent().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity getId(@PathVariable Integer i){
        if (usuarioRepository.findById(i).isPresent()){
            return ResponseEntity.ok().body(usuarioRepository.findById(i).get());
        }else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity postUser(@RequestBody User u){
        if (postLista.getNroElem() < this.tamanho){  //Se a lista obj Post estiver com espaço ela vai adcionar o usuario
            postLista.adiciona(u);
            for (Integer i= 0; i<postLista.getTamanho();i++){ // após adcionar ele faz um for percorrendo a lista OBj e adcionando no  repository
                usuarioRepository.save(postLista.getElemento(i));
            }
            postLista.limpa(); //depois de adcionar ele limpa a lista
            return ResponseEntity.created(null).build();
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/download")
    public ResponseEntity downloadFile(){
        FileWriter arquivo; // Responsavel por criar o arquivo
        Formatter exit = null; //responsavel por escrever nos arquivos

        String lista = "";

        List<User> user = usuarioRepository.findAll(); //Método do userRepository para fazer uma unica requisição retornando todos

        for (Integer i = 0;i <usuarioRepository.count(); i++){ //Esse for vai percorrer todos os dados do repositoru e vai adcionar na lista OBJ Export list
            exportLista.adiciona(user.get(i));
        }

        try{
            arquivo = new FileWriter("usuarios.csv",false);
            exit = new Formatter(arquivo);
        }catch (IOException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        } try {
            for (Integer i=0; i<exportLista.getTamanho();i++){
                User u = exportLista.getElemento(i);
                exit.format("%s;%s",u.getEmail(),u.getSenha());
                lista += String.format("%s;%s",u.getEmail(),u.getSenha());
            }
            exit.close();
        }catch (FormatterClosedException e){
            return ResponseEntity.badRequest().body(e.getCause());
        }

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition",
                    "attachment;filename= usuarios.csv"
                );

        return new ResponseEntity(lista,headers, HttpStatus.OK);
    }
}
