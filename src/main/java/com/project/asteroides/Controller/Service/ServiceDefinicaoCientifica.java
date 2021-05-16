package com.project.asteroides.Controller.Service;
 
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import com.project.asteroides.Model.DefinicaoCientifica;
import com.project.asteroides.Repository.RepositoryDefinicaoCientifica;

@Service
public class ServiceDefinicaoCientifica {
    	
    private RepositoryDefinicaoCientifica repositoryDefinicaoCientifica;
    
	public ServiceDefinicaoCientifica(RepositoryDefinicaoCientifica repositoryDefinicaoCientifica) {
		this.repositoryDefinicaoCientifica = repositoryDefinicaoCientifica;
	}
	
	public DefinicaoCientifica SaveDefinicaoCientifica(@RequestBody DefinicaoCientifica definicaoCientifica) {
		 return repositoryDefinicaoCientifica.save(definicaoCientifica);
	}
	
	public Optional<DefinicaoCientifica> ListDefinicaoCientific(@PathVariable Long id) {
		 Optional<DefinicaoCientifica> list = repositoryDefinicaoCientifica.findById(id);
		 return list;
	}
	
	public void deleteDefinicaoCi(@PathVariable Long id)  {
		repositoryDefinicaoCientifica
		                        .findById(id)
		                        .map(deleteData -> {
		                        	repositoryDefinicaoCientifica.delete(deleteData);
 		                        	return deleteData;
		                        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"nenhum asteroide para ser deletado"));
	}
	
	public void updateDefinicaoC(@RequestBody DefinicaoCientifica definicaoCientifica, @PathVariable Long id) {
		repositoryDefinicaoCientifica
		                    .findById(id)
		                    .map(updateData -> {
		                    	definicaoCientifica.setId(updateData.getId());
		                    	repositoryDefinicaoCientifica.save(definicaoCientifica);
		                    	return updateData;
		                    }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT,"nenhuma informação para ser atualizado"));
	}
}