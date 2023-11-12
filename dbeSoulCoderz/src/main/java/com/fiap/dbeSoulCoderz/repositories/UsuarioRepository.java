package com.fiap.dbeSoulCoderz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.fiap.dbeSoulCoderz.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Usuario findByEmailUsuario(String emailUsuario);
}
