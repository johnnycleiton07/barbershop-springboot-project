package com.ufal.br.organize.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long id;
	
	private String nome;
	
	private String cpf;
	
	private String endereco;
	
	public Cliente() {}
	
	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}

	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		return this.nome;
	}
	
}
