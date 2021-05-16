package com.project.asteroides.Controller.Service;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import com.project.asteroides.Model.Asteroide;
import com.project.asteroides.Repository.RepositoryAsteroides;

@Service
public class ServiceAsteroide {
   
	private RepositoryAsteroides repositoryAsteroides;
 	
	public ServiceAsteroide(RepositoryAsteroides repositoryAsteroides) {
		this.repositoryAsteroides = repositoryAsteroides;
  	}
	
	public Asteroide save(@RequestBody Asteroide asteroide) {
		Asteroide asteroidResult = repositoryAsteroides.save(asteroide);
		return asteroidResult;
	}
	
	
	public Optional<Asteroide> listId(@PathVariable Long id) {
	    Optional<Asteroide> list = Optional.ofNullable(repositoryAsteroides
	    		                        .findById(id)
	    		                        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhum asteroide encontrado")));
	    return list;
	}
	
	public void delete(@PathVariable Long id) {
		 repositoryAsteroides 
		           .findById(id)
		           .map(AnonimeDelete -> {
		        	   repositoryAsteroides.delete(AnonimeDelete);
		        	   return AnonimeDelete;
		           }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhuma informação para ser exibida"));
	}
	
	public void update(@PathVariable Long id, @RequestBody Asteroide asteroide) {
		  repositoryAsteroides
		          .findById(id)
		          .map(atualizarData -> {
		        	  asteroide.setId(atualizarData.getId());
		        	  repositoryAsteroides.save(asteroide);
		        	  return atualizarData;
		          }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"Nenhuma informacao para ser atualiazada"));
	}
}
