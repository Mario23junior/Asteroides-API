package com.project.asteroides.Controller.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
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
	 
	 public Optional<DetalhesDatas> listDetalhesD(@PathVariable Long id) {
		 return repositoryDetalhesDatas.findById(id);
	 }
	 
	
}
