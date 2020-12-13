package com.simplify.api.repositories;

import com.simplify.api.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Integer>{
}
