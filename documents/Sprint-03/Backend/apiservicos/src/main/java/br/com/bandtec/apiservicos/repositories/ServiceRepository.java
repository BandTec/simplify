package br.com.bandtec.apiservicos.repositories;

import br.com.bandtec.apiservicos.entities.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Integer>{
}
