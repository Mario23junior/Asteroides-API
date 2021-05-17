package com.project.asteroides.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class DetalhesDatas {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty(message = "{campo.DetalhesData.descobridor}")
	private String descobridor;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private Date dataDeDescorbeta;
	
	@NotEmpty(message = "{campo.DetalhesData.classe}")
	private String classe;
	
	@NotEmpty(message = "{campo.DetalhesData.descricao}")
	@Column(length = 400)
	private String descricao;
	
	@ManyToOne
	private Asteroide asteroide;

	@JsonIgnore
	public Asteroide getAsteroide() {
		return asteroide;
	}

	public void setAsteroide(Asteroide asteroide) {
		this.asteroide = asteroide;
	}

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
