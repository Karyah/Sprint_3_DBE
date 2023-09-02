package com.fiap.dbeSoulCoderz.dto;

import com.fiap.dbeSoulCoderz.model.Plano;

public record DadosListagemPlano(
		String nomePlano,
		String precoPlano, 
		String descricao) {
	public DadosListagemPlano(Plano plano) {
		this(plano.getNomePlano(), plano.getPrecoPlano(), plano.getDescricao());
	}

}
