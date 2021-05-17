package com.project.asteroides.DTOModel;

import java.util.List;

public class AsteroideDTO {
  
 	private Long id;
 	private String urlImage;
 	private String nome;
 	private String massa;
	private Double periodoOrbital;	
 	private String orbita;
 	
 	private List<DefinicaoCientificaDTO> definicaoCientificaDTOs;
 	private List<DetalhesDatasDTO> detalhesDatasDTOs;
 	
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
	public List<DefinicaoCientificaDTO> getDefinicaoCientificaDTOs() {
		return definicaoCientificaDTOs;
	}
	public void setDefinicaoCientificaDTOs(List<DefinicaoCientificaDTO> definicaoCientificaDTOs) {
		this.definicaoCientificaDTOs = definicaoCientificaDTOs;
	}
	public List<DetalhesDatasDTO> getDetalhesDatasDTOs() {
		return detalhesDatasDTOs;
	}
	public void setDetalhesDatasDTOs(List<DetalhesDatasDTO> detalhesDatasDTOs) {
		this.detalhesDatasDTOs = detalhesDatasDTOs;
	}
 	
 	
 	
}
