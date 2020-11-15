package com.simplify.api.repositories;

import com.simplify.api.entities.Documents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documents, Integer> {
}
