package com.fiap.dbeSoulCoderz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Plano")
@Table(name="Plano")
public class Plano {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPlano;
	private String nomePlano;
	private String precoPlano;
	private String descricao;
	private boolean disponivel;
	
	
	public Plano() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Plano(Long idPlano, String nomePlano, String precoPlano, String descricao, boolean disponivel) {
		super();
		this.idPlano = idPlano;
		this.nomePlano = nomePlano;
		this.precoPlano = precoPlano;
		this.descricao = descricao;
		this.disponivel = true;
	}

	public void desativar() {
		this.disponivel = false;
	}

	public Long getIdPlano() {
		return idPlano;
	}
	
	public void setIdPlano(Long idPlano) {
		this.idPlano = idPlano;
	}
	
	public String getNomePlano() {
		return nomePlano;
	}
	
	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}
	
	public String getPrecoPlano() {
		return precoPlano;
	}
	
	public void setPrecoPlano(String precoPlano) {
		this.precoPlano = precoPlano;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
	
}
