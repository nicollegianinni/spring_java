package com.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name="tb_produto") // criar tabela 
public class ProdutoModel {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; // criar classe primaria= primary key
	
	@NotBlank (message= "Nome do produto é obrigatorio!")
	private String nomeProduto; // nao permitir campo vazio = avisar ao usuario
	
	private int quantidade; // mostrar quantidade de produtos no estoque
	
	@Positive (message= "Digite um valor maior que zero!")
	private BigDecimal preco; // pesquisar por preço
	
	@ManyToOne 
	@JsonIgnoreProperties ("produto")
	private CategoriaModel categoria; // como tivesse criando um espaço para adicionar a chave estrangeira

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
	
	
}
