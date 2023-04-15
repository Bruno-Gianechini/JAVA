package one.digitalinnovation.service;
import one.digitalinnovation.model.Cliente;


public interface ClienteService {
    static Iterable<Cliente> buscarTodos() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarTodos'");
    }
    Cliente buscarPorId (Long id);
    void inserir (Cliente cliente);
    void atualizar (Long id, Cliente cliente);
    void deletar (Long id);
}
