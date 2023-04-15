package one.digitalinnovation.model;

import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToOne;

@Entity 
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    @ManyToOne private Endereco endereco;
    private String nome;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
