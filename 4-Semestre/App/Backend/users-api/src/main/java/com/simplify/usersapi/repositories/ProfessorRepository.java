package com.simplify.usersapi.repositories;

import com.simplify.usersapi.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Integer> {

}


