package com.fiap.dbeSoulCoderz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.fiap.dbeSoulCoderz.repositories.UsuarioRepository;

@Component
public class UserService implements UserDetailsService{ 
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		var detalhe = usuarioRepository.findByEmailUsuario(username);
		return detalhe;
	}

}
