package com.algawork.awvendasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algawork.awvendasapi.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

}
