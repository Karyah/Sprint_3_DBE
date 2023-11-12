package com.fiap.dbeSoulCoderz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.dbeSoulCoderz.dto.DadosRequisicaoFeedback;
import com.fiap.dbeSoulCoderz.model.Feedback;
import com.fiap.dbeSoulCoderz.repositories.FeedbackRepository;

import jakarta.transaction.Transactional;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired 
	private FeedbackRepository repository;
	
	@GetMapping
	public ModelAndView listarPlanos() {
		List<Feedback> feedbacks = repository.findAll();
		ModelAndView mv = new ModelAndView("feedback/feedbacks");
		mv.addObject("feedbacks", feedbacks);
		return mv;
	}
	
	@GetMapping("/formulario")
	public ModelAndView formulario() {
		ModelAndView mv = new ModelAndView("feedback/formulario");
		return mv;
	} 
	
	@PostMapping("/novo")
	@Transactional
	public ModelAndView novo(DadosRequisicaoFeedback requisicao) {
		Feedback feedback = new Feedback(requisicao);
		repository.save(feedback);
		ModelAndView mv = new ModelAndView("redirect:/feedback");
		return mv;
	}
}
