package com.simplify.api.repositories;

import com.simplify.api.entities.documents.Comprovante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComprovanteRepositoruy extends JpaRepository<Comprovante,Integer> {
}
