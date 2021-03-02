package br.com.bandtec.apiservicos.quiz;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PerguntasRepository extends CrudRepository<Perguntas,Integer> {
    List<Perguntas> findAll();
}
