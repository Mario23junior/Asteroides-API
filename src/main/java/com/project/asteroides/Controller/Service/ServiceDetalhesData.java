package com.project.asteroides.Controller.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.asteroides.Model.DetalhesDatas;
import com.project.asteroides.Repository.RepositoryDetalhesDatas;

@Service
public class ServiceDetalhesData {
 	
	private RepositoryDetalhesDatas repositoryDetalhesDatas;
	
	 public ServiceDetalhesData(RepositoryDetalhesDatas repositoryDetalhesDatas) {
		 this.repositoryDetalhesDatas = repositoryDetalhesDatas;
 	}
	 
	 public DetalhesDatas saveDetalhesD(@RequestBody DetalhesDatas detalhesDatas) {
		 return repositoryDetalhesDatas.save(detalhesDatas);
	 }
}
