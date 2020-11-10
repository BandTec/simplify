package com.example.sprint2.controladores;

import com.example.sprint2.dominios.PilhaObj;
import com.example.sprint2.entity.Solicitacao;
import com.example.sprint2.repositorios.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/solicitacoes")
public class LayoutPilhaController {
    @Autowired
    private SolicitacaoRepository repository;

    int tamanho = 10;

    PilhaObj<Solicitacao> solicitacoes = new PilhaObj<>(tamanho);

//    @PostMapping("/adiciona")
//    public ResponseEntity pushSolicitacao (@RequestBody Solicitacao s){
//
//        if (solicitacoes.getTopo() < this.tamanho){
//            solicitacoes.push(s);
//            for (int i = 0; i < solicitacoes.getTopo(); i++){
//                repository.save(solicitacoes.getTopo(i));
//                return ResponseEntity.ok(200);
//            }
//        }
//    }
}
