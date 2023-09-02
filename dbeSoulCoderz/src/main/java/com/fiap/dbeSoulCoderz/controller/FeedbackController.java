package com.fiap.dbeSoulCoderz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.dbeSoulCoderz.model.Feedback;
import com.fiap.dbeSoulCoderz.repositories.FeedbackRepository;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

	@Autowired 
	private FeedbackRepository repository;
	
	@GetMapping
	public ModelAndView listarPlanos() {
		List<Feedback> feedbacks = repository.findAll();
		ModelAndView mv = new ModelAndView("feedback");
		mv.addObject("feedbacks", feedbacks);
		return mv;
	}
}
