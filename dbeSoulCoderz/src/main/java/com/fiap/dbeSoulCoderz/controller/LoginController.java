package com.fiap.dbeSoulCoderz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("login")
public class LoginController {
	
	
	@GetMapping
	public ModelAndView login() {
		ModelAndView mv= new ModelAndView("/login");
		return mv;
	}
	

}
