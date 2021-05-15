package com.project.asteroides.Controller.Service;
 
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
}
