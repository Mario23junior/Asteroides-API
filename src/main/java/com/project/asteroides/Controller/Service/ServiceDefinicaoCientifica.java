package com.project.asteroides.Controller.Service;
 
import org.springframework.stereotype.Service;

import com.project.asteroides.Repository.RepositoryDefinicaoCientifica;

@Service
public class ServiceDefinicaoCientifica {
    	
    private RepositoryDefinicaoCientifica repositoryDefinicaoCientifica;
    
	public ServiceDefinicaoCientifica(RepositoryDefinicaoCientifica repositoryDefinicaoCientifica) {
		this.repositoryDefinicaoCientifica = repositoryDefinicaoCientifica;
	}
	
	
}
