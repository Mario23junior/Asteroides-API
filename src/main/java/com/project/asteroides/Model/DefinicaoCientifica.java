package com.project.asteroides.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DefinicaoCientifica {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Double diametroMedio;
	
	private Double gravidade;
	
	private Double distanciaMediadoSol;
	
	private Double raio;
	
	@ManyToOne
	private Asteroide asteroide;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getDiametroMedio() {
		return diametroMedio;
	}

	public void setDiametroMedio(Double diametroMedio) {
		this.diametroMedio = diametroMedio;
	}

	public Double getGravidade() {
		return gravidade;
	}

	public void setGravidade(Double gravidade) {
		this.gravidade = gravidade;
	}

	public Double getDistanciaMediadoSol() {
		return distanciaMediadoSol;
	}

	public void setDistanciaMediadoSol(Double distanciaMediadoSol) {
		this.distanciaMediadoSol = distanciaMediadoSol;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}	
}
