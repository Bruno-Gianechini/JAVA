package main.java.one.digitalinnovation.model;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {
    
}