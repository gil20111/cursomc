 package com.antoniogilberto.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antoniogilberto.cursomc.domain.Pagamento;

@Repository 
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer>{
	
	

}

