package com.project.asteroides.Controller.Service;
 
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.asteroides.Exception.ObjectByReturnToEmpty;
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
		  Optional<DefinicaoCientifica> listId = Optional.ofNullable(repositoryDefinicaoCientifica
                  .findById(id)
                  .orElseThrow(() -> new ObjectByReturnToEmpty("Nenhum definição Cientifica encontrada ")));
		  
		  return listId;
  	}
	
	public void deleteDefinicaoCi(@PathVariable Long id)  {
		repositoryDefinicaoCientifica
		                        .findById(id)
		                        .map(deleteData -> {
		                        	repositoryDefinicaoCientifica.delete(deleteData);
 		                        	return deleteData;
		                        }).orElseThrow(() -> new ObjectByReturnToEmpty("nenhuma definicao encontrada para ser deletado"));
	}
	
	public void updateDefinicaoC(@RequestBody DefinicaoCientifica definicaoCientifica, @PathVariable Long id) {
		repositoryDefinicaoCientifica
		                    .findById(id)
		                    .map(updateData -> {
		                    	definicaoCientifica.setId(updateData.getId());
		                    	repositoryDefinicaoCientifica.save(definicaoCientifica);
		                    	return updateData;
		                    }).orElseThrow(() -> new ObjectByReturnToEmpty("nenhuma definição para ser atualizado"));
	}
}