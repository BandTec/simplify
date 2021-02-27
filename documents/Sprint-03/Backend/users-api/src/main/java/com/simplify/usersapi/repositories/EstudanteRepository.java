package com.simplify.usersapi.repositories;

import com.simplify.usersapi.entities.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante,Integer> {
}
