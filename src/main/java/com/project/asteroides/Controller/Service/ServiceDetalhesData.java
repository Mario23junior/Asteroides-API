package com.project.asteroides.Controller.Service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

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
	 
	 public void deleteDetalhesData(@PathVariable Long id) {
		 repositoryDetalhesDatas
		              .findById(id)
		              .map(deleteData -> {
		            	  repositoryDetalhesDatas.delete(deleteData);
 		            	  return deleteData;
		              }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"nenhuma informacao foi encontrada"));
		 
	 }
	 
	 public void updateDetalhes(@PathVariable Long id, @RequestBody DetalhesDatas detalhesDatas) {
		    repositoryDetalhesDatas
		                   .findById(id)
		                   .map(update -> {
		                	   detalhesDatas.setId(update.getId());
		                	   repositoryDetalhesDatas.save(detalhesDatas);
		                	   return update;
		                   }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhuma informacao para ser atualizada"));
	 }	 
}