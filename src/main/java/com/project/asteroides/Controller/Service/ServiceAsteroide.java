package com.project.asteroides.Controller.Service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.asteroides.Exception.ObjectByReturnToEmpty;
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
	
	
	public Optional<Asteroide> listId(@PathVariable @Valid Long id) {
	    Optional<Asteroide> list = Optional.ofNullable(repositoryAsteroides
	    		                        .findById(id)
	    		                        .orElseThrow(() -> new ObjectByReturnToEmpty("Nenhum asteroide encontrado")));
		    return list;
	    }
	
	
	public void delete(@PathVariable Long id) {
		 repositoryAsteroides 
		           .findById(id)
		           .map(AnonimeDelete -> {
		        	   repositoryAsteroides.delete(AnonimeDelete);
		        	   return AnonimeDelete;
		           }).orElseThrow(() -> new ObjectByReturnToEmpty("Nenhuma Asteroide encontrado para ser deletado"));
	}
	
	public void update(@PathVariable Long id, @RequestBody Asteroide asteroide) {
		  repositoryAsteroides
		          .findById(id)
		          .map(atualizarData -> {
		        	  asteroide.setId(atualizarData.getId());
		        	  repositoryAsteroides.save(asteroide);
		        	  return atualizarData;
		          }).orElseThrow(() -> new ObjectByReturnToEmpty("Nenhuma Asteroide encontrado para ser atualizado"));
	}
	
 	public List<Asteroide> pagination(int pageNo, @PathVariable int pageSize){
		PageRequest pagin = PageRequest.of(pageNo, pageSize);
 		Page<Asteroide>  pageResult = repositoryAsteroides.findAll(pagin);
	
 		return pageResult.toList();
	}	
}