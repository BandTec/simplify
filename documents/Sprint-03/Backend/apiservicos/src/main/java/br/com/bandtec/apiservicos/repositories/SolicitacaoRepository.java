package br.com.bandtec.apiservicos.repositories;

import br.com.bandtec.apiservicos.entities.Solicitacao;
import org.springframework.data.repository.CrudRepository;

public interface SolicitacaoRepository extends CrudRepository<Solicitacao, Integer> {
}
