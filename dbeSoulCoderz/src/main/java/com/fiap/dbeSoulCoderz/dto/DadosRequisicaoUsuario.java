package com.fiap.dbeSoulCoderz.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosRequisicaoUsuario(
		@NotBlank
		String nomeUsuario, 
		@NotBlank
		String emailUsuario, 
		@NotBlank
		String senhaUsuario, 
		@NotBlank
		String telefoneUsuario, 
		@NotBlank
		String cpfUsuario){
}
