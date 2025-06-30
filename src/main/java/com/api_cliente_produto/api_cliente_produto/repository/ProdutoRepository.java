package com.api_cliente_produto.api_cliente_produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_cliente_produto.api_cliente_produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto,Long>{

}
    