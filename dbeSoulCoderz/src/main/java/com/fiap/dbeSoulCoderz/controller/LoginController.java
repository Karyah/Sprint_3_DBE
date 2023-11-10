package com.fiap.dbeSoulCoderz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.dbeSoulCoderz.dto.AuthenticationDTO;

import jakarta.validation.Valid;

@RestController("/login")
public class LoginController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@GetMapping
	public ModelAndView login() {
		ModelAndView mv= new ModelAndView("/login");
		return mv;
	}
	
	@PostMapping
	public ResponseEntity logar(@RequestBody @Valid AuthenticationDTO data) {
		var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.senha());
		var auth = this.authenticationManager.authenticate(usernamePassword);
		
		return ResponseEntity.ok().build();
	}
}
