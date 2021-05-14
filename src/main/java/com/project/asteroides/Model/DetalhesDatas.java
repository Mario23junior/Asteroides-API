package com.project.asteroides.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetalhesDatas {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String descobridor;
	
	private Date dataDeDescorbeta;
	
	private String classe;
	
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescobridor() {
		return descobridor;
	}

	public void setDescobridor(String descobridor) {
		this.descobridor = descobridor;
	}

	public Date getDataDeDescorbeta() {
		return dataDeDescorbeta;
	}

	public void setDataDeDescorbeta(Date dataDeDescorbeta) {
		this.dataDeDescorbeta = dataDeDescorbeta;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}
