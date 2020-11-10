 package com.antoniogilberto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antoniogilberto.cursomc.domain.Produto;

@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	

}

