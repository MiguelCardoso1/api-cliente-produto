package com.api_cliente_produto.api_cliente_produto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api_cliente_produto.api_cliente_produto.model.Cliente;
import com.api_cliente_produto.api_cliente_produto.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository repository;

    public List<Cliente> listartodos() {
        return repository.findAll();
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Cliente atualizar(Long id, Cliente clienteAtualizado) {
         return repository.findById(id).map(clienteExistente -> {
            clienteExistente.setNome(clienteAtualizado.getNome());
            clienteExistente.setProdutos(clienteAtualizado.getProdutos());
            return repository.save(clienteExistente);
         }).orElseThrow(() -> new RuntimeException("Cliente não encontrado com id: " + id));

    }
}
