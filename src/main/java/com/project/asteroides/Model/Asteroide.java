package com.project.asteroides.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Asteroide {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotEmpty( message = "{campo.asteroide.urlImage}")
	private String urlImage;
	
	@NotEmpty(message = "{campo.asteroide.nome}")
	private String nome;
	
	@NotEmpty(message = "{campo.asteroide.massa}")
	private String massa;
		
	private Double periodoOrbital;
	
	@NotEmpty(message = "{campo.asteroide.orbita}")
	private String orbita;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public Double getPeriodoOrbital() {
		return periodoOrbital;
	}

	public void setPeriodoOrbital(Double periodoOrbital) {
		this.periodoOrbital = periodoOrbital;
	}

	public String getOrbita() {
		return orbita;
	}

	public void setOrbita(String orbita) {
		this.orbita = orbita;
	}
}
