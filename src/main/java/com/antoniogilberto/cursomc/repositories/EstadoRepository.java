package com.antoniogilberto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antoniogilberto.cursomc.domain.Estado;

@Repository 
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	
	

}

  