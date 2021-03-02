package br.com.bandtec.apiservicos.quiz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/quiz")
public class PerguntasController {

    @Autowired
    PerguntasRepository repository;

    @PostMapping("/cadastrar")
    public ResponseEntity post(@RequestBody Perguntas perguntas){
        repository.save(perguntas);
        System.out.println(perguntas);
        return created(null).build();
    }
    @GetMapping
    public ResponseEntity getPerguntas(){
        if (repository.count()>0){
            return  ResponseEntity.ok(repository.findAll());}
        else {
            return ResponseEntity.noContent().build();
        }}
}
