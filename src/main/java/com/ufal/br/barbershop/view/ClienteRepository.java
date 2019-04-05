package com.ufal.br.barbershop.view;

import org.springframework.data.repository.CrudRepository;

import com.ufal.br.barbershop.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

	Cliente findByCodigo(long id);
	
}
