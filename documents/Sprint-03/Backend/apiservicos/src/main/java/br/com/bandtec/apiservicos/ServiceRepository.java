package br.com.bandtec.apiservicos;

import br.com.bandtec.apiservicos.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Integer>{
}
