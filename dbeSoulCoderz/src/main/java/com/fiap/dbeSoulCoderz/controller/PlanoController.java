package com.fiap.dbeSoulCoderz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.fiap.dbeSoulCoderz.model.Plano;
import com.fiap.dbeSoulCoderz.repositories.PlanoRepository;


@Controller
@RequestMapping("/planos")
public class PlanoController {

	@Autowired
	private PlanoRepository repository;
	
	/*
	@GetMapping
	public ModelAndView planos(@PageableDefault(size = 10) Pageable paginacao) {
		Page<DadosListagemPlano> planos = repository.findAllByDisponivelTrue(paginacao).map(DadosListagemPlano::new);
		ModelAndView mv = new ModelAndView("plano");
		mv.addObject("planos",planos);
		return mv;
	}
	*/ 
	
	@GetMapping
	public ModelAndView planos() {
		List<Plano> planos = repository.findAll();
		ModelAndView mv = new ModelAndView("plano");
		mv.addObject("planos", planos);
		return mv;
	}
}
