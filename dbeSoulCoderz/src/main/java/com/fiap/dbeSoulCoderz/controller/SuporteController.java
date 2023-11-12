package com.fiap.dbeSoulCoderz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.dbeSoulCoderz.model.Suporte;
import com.fiap.dbeSoulCoderz.repositories.SuporteRepository;

@Controller
@RequestMapping("/suporte")
public class SuporteController {
	
	@Autowired
	private SuporteRepository repository;
	
	@GetMapping
	public ModelAndView listarSuporte() {
		List<Suporte> suportes = repository.findAll();
		ModelAndView mv = new ModelAndView("suporte");
		mv.addObject("suportes",suportes);
		return mv;
	}
}
