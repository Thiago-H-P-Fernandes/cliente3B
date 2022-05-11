package br.senai.service;

import br.senai.model.Cliente;
import java.util.List;
import java.util.Optional;

public interface ClienteService {
    public  List<Cliente> findAll();
    public Cliente save(Cliente cliente);

    public Cliente findById(long id);
    public Cliente findByNome(String nome);

    public void delete(Cliente cliente);
}
