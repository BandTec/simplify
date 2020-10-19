package com.example.sprint2.repositorios;

import com.example.sprint2.dominios.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository  extends JpaRepository <Usuario,Integer> {
//    List<Usuario> findByUser

}
