package com.fiap.dbeSoulCoderz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

import com.fiap.dbeSoulCoderz.model.Plano;
import com.fiap.dbeSoulCoderz.repositories.PlanoRepository;


@Controller
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private PlanoRepository repository;
	
	@GetMapping
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		List<Plano> planos = repository.findAll();
		mv.addObject("planos", planos);
		return mv;
	} 
}
