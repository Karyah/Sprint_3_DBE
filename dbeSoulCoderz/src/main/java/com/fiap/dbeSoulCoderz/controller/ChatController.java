package com.fiap.dbeSoulCoderz.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.dbeSoulCoderz.dto.DadosChat;
import com.fiap.dbeSoulCoderz.services.Interpretador;

@RequestMapping("/chat")
@Controller
public class ChatController {

	@GetMapping
	public ModelAndView chat() {
		ModelAndView mv = new ModelAndView("chat");
		return mv;
	}
	

	@PostMapping
	public ModelAndView chatResposta(DadosChat dados) {
		ModelAndView mv = new ModelAndView("chat");
		Interpretador service = new Interpretador();
		var msg = service.interpretar(dados.mensagem());
		mv.addObject("resposta", msg);
		return mv;
	}
}
