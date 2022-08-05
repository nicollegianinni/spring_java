package com.generation.farmacia.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.farmacia.model.ProdutoModel;
import com.generation.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping ("/produtos")
@CrossOrigin ("*")

public class ProdutoController {
	
	@Autowired 
	private ProdutoRepository produtoRepository;
	
	@GetMapping ("/preco_inicial/{inicio}/preco_final/{fim}")
	public ResponseEntity <List<ProdutoModel>> getByPrecoEntre (@PathVariable BigDecimal inicio, @PathVariable BigDecimal fim){
		return ResponseEntity.ok(produtoRepository.buscarProdutosEntre(inicio,fim)); // ajeitar la na interface produtos repositorio
	}
	
}
