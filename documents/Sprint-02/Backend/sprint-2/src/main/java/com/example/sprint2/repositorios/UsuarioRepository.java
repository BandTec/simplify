package com.example.sprint2.repositorios;

import com.example.sprint2.entity.Cliente;
import com.example.sprint2.visoes.LayoutSimple;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsuarioRepository  extends CrudRepository<Cliente,Integer> {
//    List<Usuario> findByUser

    List<Cliente> findAll();

    @Query("select c from Cliente c")
    List<LayoutSimple> findAllSimples();
}
