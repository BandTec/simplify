package com.simplify.api.repositories;

import com.simplify.api.entities.ImportDocumentos;
import org.springframework.data.repository.CrudRepository;

public interface DocumentosImportRepository extends CrudRepository<ImportDocumentos, Integer> {
}
