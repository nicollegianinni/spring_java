package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmacia.model.ProdutoModel;

// repository tem que ser interface - nao pode ser classe
// ele puxa o JPA repository < pdoe fazer consultas |  ProdutoModel é a minha classe e o |  Long = consulta nosso Long do campo de ID da nossa Model
// JPA É UMA SUPER CLASSE É UMA BIBLIOTECA - METODOS PRONTOS - ELE JUNTA BACKEND API (EM SPRING) COM BANCO DE DADOS SQL
//  A CADA CLASSE CRIADA NA MODEL ELE CRIA UM REPOSITORY

public interface ProdutoRepository extends JpaRepository <ProdutoModel,Long> { 
	public List<ProdutoModel> findByPrecoBetween (@Param("inicio") BigDecimal inicio, @Param("fim") BigDecimal fim);

}
