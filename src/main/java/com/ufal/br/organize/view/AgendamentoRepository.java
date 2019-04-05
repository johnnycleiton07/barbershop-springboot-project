package com.ufal.br.organize.view;

import org.springframework.data.repository.CrudRepository;

import com.ufal.br.organize.model.Agendamento;

public interface AgendamentoRepository extends CrudRepository<Agendamento, String>{

	Agendamento findByCodigo(long codigo);
	
	
}
