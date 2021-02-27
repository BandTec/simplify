package com.simplify.api.repositories;

import com.simplify.api.entities.documents.Comprovante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComprovanteRepository extends JpaRepository<Comprovante,Integer> {
}
