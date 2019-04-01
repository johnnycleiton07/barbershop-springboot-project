package com.ufal.br.barbershop.view;

import org.springframework.data.repository.CrudRepository;

import com.ufal.br.barbershop.model.Agendamento;

public interface AgendamentoRepository extends CrudRepository<Agendamento, String>{
	
	
}
