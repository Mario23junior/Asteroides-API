package com.project.asteroides.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.asteroides.Controller.Service.ServiceDetalhesData;
import com.project.asteroides.Model.DetalhesDatas;

@RequestMapping("/api/v1/DetalhesDatas")
@RestController
public class ControllerDetalhesDatas {
   
	private ServiceDetalhesData service;
	
	public ControllerDetalhesDatas(ServiceDetalhesData service) {
		this.service = service;
 	}
	
	@PostMapping("/")
	public DetalhesDatas saveDetalhesData(@RequestBody DetalhesDatas detalhesDatas) {
		return service.saveDetalhesD(detalhesDatas);
	}
	
	@GetMapping("/{id}")
	public Optional<DetalhesDatas> listDetalhesData(@PathVariable Long id) {
		return service.listDetalhesD(id);
	}

}





