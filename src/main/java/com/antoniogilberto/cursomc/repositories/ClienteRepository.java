package com.antoniogilberto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.antoniogilberto.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	

}
