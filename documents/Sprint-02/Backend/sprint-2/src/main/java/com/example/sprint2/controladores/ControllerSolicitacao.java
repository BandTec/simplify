package com.example.sprint2.controladores;

import com.example.sprint2.entity.Solicitacao;
import com.example.sprint2.repositorios.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;

@RestController
@RequestMapping("/service")
public class ControllerSolicitacao {

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    //Serviços
    @GetMapping
    public ResponseEntity services(@RequestParam(required = true)  Boolean teste){

        Integer tamanho = Math.toIntExact(solicitacaoRepository.count());


        ArrayList<Iterable<Solicitacao>> solicitacaos = new ArrayList<>();

        for(Integer i =0 ; i<tamanho;i++){
            solicitacaos.add(solicitacaoRepository.findAll());
        }

        Iterator<Iterable<Solicitacao>> it = solicitacaos.iterator();

        while (it.hasNext()){

            for (Integer i=0; i< solicitacaoRepository.count();i++){
                Solicitacao s = solicitacaoRepository.findById(i).get();
                if (!teste.equals(s.isPresencial())){
                    it.remove();
                    return ResponseEntity.ok().body(it);
                } else{
                    return ResponseEntity.ok().body(it);
                }
            }

        }
        return ResponseEntity.ok().body("foi");
    }
}
