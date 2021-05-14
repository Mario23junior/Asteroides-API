package com.project.asteroides.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asteroide {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String UrlImage;
	
	private String nome;
	
	private String massa;
		
	private Integer periodoOrbital;
	
	private String orbita;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrlImage() {
		return UrlImage;
	}

	public void setUrlImage(String urlImage) {
		UrlImage = urlImage;
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

	public Integer getPeriodoOrbital() {
		return periodoOrbital;
	}

	public void setPeriodoOrbital(Integer periodoOrbital) {
		this.periodoOrbital = periodoOrbital;
	}

	public String getOrbita() {
		return orbita;
	}

	public void setOrbita(String orbita) {
		this.orbita = orbita;
	} 
}
