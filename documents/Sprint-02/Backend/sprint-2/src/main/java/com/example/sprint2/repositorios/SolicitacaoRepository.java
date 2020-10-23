package com.example.sprint2.repositorios;

import com.example.sprint2.entity.Solicitacao;
import com.example.sprint2.visoes.SolicitacaoSimples;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SolicitacaoRepository extends CrudRepository<Solicitacao, Integer> {

    @Query("select new com.example.sprint2.visoes.SolicitacaoSimples (s.id,s.Descricao, s.Online, s.Presencial) from Solicitacao s")
    List<SolicitacaoSimples> findAllSimples();


}
