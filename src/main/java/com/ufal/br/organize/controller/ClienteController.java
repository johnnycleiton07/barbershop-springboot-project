package com.ufal.br.organize.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ufal.br.organize.model.Cliente;
import com.ufal.br.organize.view.ClienteRepository;

public class ClienteController {

	@Autowired
	private ClienteRepository cr;
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.GET)
	public String form() {
		return "agenda/formCliente";
	}
	
	@RequestMapping("/deletarCliente")
	public String deletarCliente(long id) {
		Cliente cliente = cr.findByCodigo(id);
		cr.delete(cliente);
		return "redirect:/agendamento";
	}
	
	@RequestMapping(value="/cadastrarCliente", method=RequestMethod.POST)
	public String form(Cliente cliente) {
		cr.save(cliente);
		return "redirect:/cadastrarCliente";
	}
	
	@RequestMapping("/listarClientes")
	public ModelAndView listarClientes() {
		ModelAndView mv = new ModelAndView("agenda/listarclientes");
		Iterable<Cliente> cliente = cr.findAll();
		mv.addObject("cliente", cliente);
		return mv;
	}
	
/*	public Cliente buscarCliente(Integer id) {
		Cliente cliente = cr.findByCodigo(id);
		return cliente;
	}
	
	@RequestMapping(value="/agendarServico", method=RequestMethod.POST)
	public boolean cadastrarCliente(Cliente cliente) {
		boolean cadastro = false;
		if(cr.save(cliente) != null) {
			cadastro = true;
		}
		return cadastro;
	}
	*/
}

