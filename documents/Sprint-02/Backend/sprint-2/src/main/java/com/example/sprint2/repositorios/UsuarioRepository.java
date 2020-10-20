package com.example.sprint2.repositorios;

import com.example.sprint2.dominios.Usuario;
import com.example.sprint2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository  extends JpaRepository <User,Integer> {
//    List<Usuario> findByUser

    List<User> findAll();
}
