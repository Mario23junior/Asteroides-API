package com.project.asteroides.Controller.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.asteroides.Exception.ObjectByReturnToEmpty;
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
		 return Optional.ofNullable(repositoryDetalhesDatas
				 .findById(id)
				 .orElseThrow(() -> new ObjectByReturnToEmpty("Nenhuma informação de detalhes foi encontrado")));
	 }
	 
	 
	 public List<DetalhesDatas> listByClass(@RequestParam(name = "classe") String classe){
		 return repositoryDetalhesDatas.findByClasseIgnoreCaseContaining(classe);
		 
	 }
	 
	 public void deleteDetalhesData(@PathVariable Long id) {
		 repositoryDetalhesDatas
		              .findById(id)
		              .map(deleteData -> {
		            	  repositoryDetalhesDatas.delete(deleteData);
 		            	  return deleteData;
		              }).orElseThrow(() -> new ObjectByReturnToEmpty("nenhuma informacao foi encontrada"));
		 
	 }
	 
	 public void updateDetalhes(@PathVariable Long id, @RequestBody DetalhesDatas detalhesDatas) {
		    repositoryDetalhesDatas
		                   .findById(id)
		                   .map(update -> {
		                	   detalhesDatas.setId(update.getId());
		                	   repositoryDetalhesDatas.save(detalhesDatas);
		                	   return update;
		                   }).orElseThrow(() -> new ObjectByReturnToEmpty("Nenhuma informacao para ser atualizada"));
	 }	 
}