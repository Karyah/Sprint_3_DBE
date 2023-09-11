package com.fiap.dbeSoulCoderz.model;

import com.fiap.dbeSoulCoderz.dto.DadosRequisicaoFeedback;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="feedback")
@Table(name="feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long idFeedback;
	private String nomeFeedback;
	private String tipoFeedback;
	private boolean ativoFeedback;
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Feedback(DadosRequisicaoFeedback requisicao) {
		this.nomeFeedback = requisicao.nomeFeedback();
		this.tipoFeedback = requisicao.tipoFeedback();
		this.ativoFeedback = true;
	}

	public Feedback(Long idFeedback, String nomeFeedback, String tipoFeedback, boolean ativoFeedback) {
		super();
		this.idFeedback = idFeedback;
		this.nomeFeedback = nomeFeedback;
		this.tipoFeedback = tipoFeedback;
		this.ativoFeedback = ativoFeedback;
	}

	public Long getIdFeedback() {
		return idFeedback;
	}

	public void setIdFeedback(Long idFeedback) {
		this.idFeedback = idFeedback;
	}

	public String getNomeFeedback() {
		return nomeFeedback;
	}

	public void setNomeFeedback(String nomeFeedback) {
		this.nomeFeedback = nomeFeedback;
	}

	public String getTipoFeedback() {
		return tipoFeedback;
	}

	public void setTipoFeedback(String tipoFeedback) {
		this.tipoFeedback = tipoFeedback;
	}

	public boolean isAtivoFeedback() {
		return ativoFeedback;
	}

	public void setAtivoFeedback(boolean ativoFeedback) {
		this.ativoFeedback = ativoFeedback;
	}
	
	
	
}
