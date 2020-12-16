package br.com.bandtec.apiservicos.controllers;

import br.com.bandtec.apiservicos.entities.Solicitacao;
import br.com.bandtec.apiservicos.repositories.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/solicitar")
public class SolicitacaoController {

    @Autowired
    SolicitacaoRepository repository;

    @PostMapping("/cadastrar")
    public ResponseEntity post(@RequestBody Solicitacao solicitacao){
        repository.save(solicitacao);
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
