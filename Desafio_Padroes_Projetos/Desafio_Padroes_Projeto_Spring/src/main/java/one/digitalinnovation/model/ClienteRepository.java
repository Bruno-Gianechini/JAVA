package main.java.one.digitalinnovation.model;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
