package com.ufal.br.organize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ufal.br.organize.model.Agendamento;
import com.ufal.br.organize.view.AgendamentoRepository;

@Controller
public class AgendamentoController {
	
	@Autowired
	private AgendamentoRepository ar;
	
	@RequestMapping(value="/agendarServico", method=RequestMethod.GET)
	public String form() {
		return "agenda/formAgenda";
	}
	
	@RequestMapping("/deletar")
	public String deletarAgendamento(long codigo) {
		Agendamento agendamento = ar.findByCodigo(codigo);
		ar.delete(agendamento);
		return "redirect:/agendamento";
	}
	
	
	@RequestMapping(value="/agendarServico", method=RequestMethod.POST)
	public String form(Agendamento agenda) {
		
		ar.save(agenda);
		
		return "redirect:/agendarServico";
	}
	
	@RequestMapping("/agendamento")
	public ModelAndView listarAgendamentos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Agendamento> agendamento = ar.findAll();
		mv.addObject("agendamento", agendamento);
		return mv;
	}

}

