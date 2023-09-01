package com.fiap.dbeSoulCoderz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="Empresa")
@Table(name="Empresa")
public class Empresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idEmpresa;
	private String nomeEmp;
	private String emailEmp;
	private String cnpjEmp;
	private String telefoneEmp;
	private boolean ativoEmpresa;
	
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(Long idEmpresa, String nomeEmp, String emailEmp, String cnpjEmp, String telefoneEmp,
			boolean ativoEmpresa) {
		super();
		this.idEmpresa = idEmpresa;
		this.nomeEmp = nomeEmp;
		this.emailEmp = emailEmp;
		this.cnpjEmp = cnpjEmp;
		this.telefoneEmp = telefoneEmp;
		this.ativoEmpresa = ativoEmpresa;
	}

	public Long getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomeEmp() {
		return nomeEmp;
	}

	public void setNomeEmp(String nomeEmp) {
		this.nomeEmp = nomeEmp;
	}

	public String getEmailEmp() {
		return emailEmp;
	}

	public void setEmailEmp(String emailEmp) {
		this.emailEmp = emailEmp;
	}

	public String getCnpjEmp() {
		return cnpjEmp;
	}

	public void setCnpjEmp(String cnpjEmp) {
		this.cnpjEmp = cnpjEmp;
	}

	public String getTelefoneEmp() {
		return telefoneEmp;
	}

	public void setTelefoneEmp(String telefoneEmp) {
		this.telefoneEmp = telefoneEmp;
	}

	public boolean isAtivoEmpresa() {
		return ativoEmpresa;
	}

	public void setAtivoEmpresa(boolean ativoEmpresa) {
		this.ativoEmpresa = ativoEmpresa;
	}
	
	
	
}
