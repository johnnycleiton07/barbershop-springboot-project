package com.ufal.br.organize.view;

import org.springframework.data.repository.CrudRepository;

import com.ufal.br.organize.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

	Cliente findByCodigo(long id);
	
}
