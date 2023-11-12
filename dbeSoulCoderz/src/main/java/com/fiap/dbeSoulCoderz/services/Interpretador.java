package com.fiap.dbeSoulCoderz.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public class Interpretador {

	public String interpretar(String dados) {
		if(dados.contains("oi")) {
			return "Olá, sou o SoulChat!";
		}
		else if(dados.contains("império romano")) {
			return "Império Romano foi a fase da civilização romana que se estendeu de 27 a.C. a 476 d.C.\n Dominado pelos imperadores, o império teve fim com a destituição de Rômulo Augusto.";
		}
		else if(dados.contains("Lorem")) {
			return "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
		}
		
		return "Desculpa, não entendi";
		
	}
}
