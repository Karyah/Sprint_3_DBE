package com.fiap.dbeSoulCoderz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="suporte")
@Table(name="suporte")
public class Suporte {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSuporte;
	private String nomeRequisicaoSup;
	private String emailRequisicaoSup;
	private boolean solucionado;
	
	public Suporte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suporte(Long idSuporte, String emailRequisicaoSup, String nomeRequisicaoSup, boolean solucionado) {
		super();
		this.idSuporte = idSuporte;
		this.nomeRequisicaoSup = nomeRequisicaoSup;
		this.emailRequisicaoSup = emailRequisicaoSup;
		this.solucionado = solucionado;
	}

	public Long getIdSuporte() {
		return idSuporte;
	}

	public void setIdSuporte(Long idSuporte) {
		this.idSuporte = idSuporte;
	}

	public String getNomeRequisicaoSup() {
		return nomeRequisicaoSup;
	}
	
	public String getEmailRequisicaoSup() {
		return emailRequisicaoSup;
	}

	public void setEmailRequisicaoSup(String emailRequisicaoSup) {
		this.emailRequisicaoSup = emailRequisicaoSup;
	}

	public void setNomeRequisicaoSup(String nomeRequisicaoSup) {
		this.nomeRequisicaoSup = nomeRequisicaoSup;
	}

	public boolean isSolucionado() {
		return solucionado;
	}

	public void setSolucionado(boolean solucionado) {
		this.solucionado = solucionado;
	}
	
	
	
}
