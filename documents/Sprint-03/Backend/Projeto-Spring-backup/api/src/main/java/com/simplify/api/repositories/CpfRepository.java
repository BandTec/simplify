package com.simplify.api.repositories;

import com.simplify.api.entities.documents.CPF;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CpfRepository extends JpaRepository<CPF,Integer> {
}
