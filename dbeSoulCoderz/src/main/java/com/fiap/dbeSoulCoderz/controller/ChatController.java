package com.fiap.dbeSoulCoderz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/chat")
@Controller
public class ChatController {

	@GetMapping
	public ModelAndView chat() {
		ModelAndView mv = new ModelAndView("chat");
		return mv;
	}
}
