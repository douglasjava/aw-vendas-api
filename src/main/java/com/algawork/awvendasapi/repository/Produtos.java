package com.algawork.awvendasapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algawork.awvendasapi.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
