package com.project.asteroides.DTOModel;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DetalhesDatasDTO {

 	private Long id;
 	private String descobridor;
 	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
 	private Date dataDedescoberta;
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
	
	public Date getDataDedescoberta() {
		return dataDedescoberta;
	}
	public void setDataDedescoberta(Date dataDedescoberta) {
		this.dataDedescoberta = dataDedescoberta;
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
