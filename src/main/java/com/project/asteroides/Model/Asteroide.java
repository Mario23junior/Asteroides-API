package com.project.asteroides.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	
	@OneToMany(mappedBy = "asteroide", cascade = CascadeType.ALL)
	private List<DefinicaoCientifica> definicaoCientificas;

	@OneToMany(mappedBy = "asteroide", cascade = CascadeType.ALL)
	private List<DetalhesDatas> detalhesDatas;
	
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
    
	@JsonIgnore
	public List<DefinicaoCientifica> getDefinicaoCientificas() {
		return definicaoCientificas;
	}

	public void setDefinicaoCientificas(List<DefinicaoCientifica> definicaoCientificas) {
		this.definicaoCientificas = definicaoCientificas;
	}

	@JsonIgnore
	public List<DetalhesDatas> getDetalhesDatas() {
		return detalhesDatas;
	}

	public void setDetalhesDatas(List<DetalhesDatas> detalhesDatas) {
		this.detalhesDatas = detalhesDatas;
	}
	
	
}
