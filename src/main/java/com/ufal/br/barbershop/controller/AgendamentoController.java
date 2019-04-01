package com.ufal.br.barbershop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ufal.br.barbershop.model.Agendamento;
import com.ufal.br.barbershop.view.AgendamentoRepository;

@Controller
public class AgendamentoController {
	
	@Autowired
	private AgendamentoRepository ar;
	
	@RequestMapping(value="/agendarServico", method=RequestMethod.GET)
	public String form() {
		return "agenda/formAgenda";
	}
	
	@RequestMapping(value="/agendarServico", method=RequestMethod.POST)
	public String form(Agendamento agenda) {
		
		ar.save(agenda);
		
		return "redirect:/agendarServico";
	}
	
	@RequestMapping("/agendamentos")
	public ModelAndView listarAgendamentos() {
		ModelAndView mv = new ModelAndView("index");
		Iterable<Agendamento> agendamentos = ar.findAll();
		mv.addObject("agendamentos", agendamentos);
		return mv;
	}

}

