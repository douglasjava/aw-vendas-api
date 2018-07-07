package com.algawork.awvendasapi.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algawork.awvendasapi.model.Produto;
import com.algawork.awvendasapi.repository.Produtos;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

	@Autowired
	private Produtos produtos;
	
	@GetMapping
	public List<Produto> listar(){
		return produtos.findAll();
	}
}
