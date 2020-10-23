package com.example.sprint2.repositorios;

import com.example.sprint2.entity.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {

    //  List<Endereco> findAll();
}
