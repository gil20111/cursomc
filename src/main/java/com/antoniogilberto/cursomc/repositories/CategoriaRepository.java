package com.antoniogilberto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antoniogilberto.cursomc.domain.Categoria;

@Repository 
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	

}
