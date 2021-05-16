package com.project.asteroides.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.asteroides.Controller.Service.ServiceDefinicaoCientifica;
import com.project.asteroides.Model.DefinicaoCientifica;

@RequestMapping("/api/v1/definicaoCientifica")
@RestController
public class ControllerDefinicaoCientifica {
    
	private ServiceDefinicaoCientifica service;
	
	public ControllerDefinicaoCientifica(ServiceDefinicaoCientifica service) {
		this.service = service;
 	}
	
	@PostMapping("/")
	public DefinicaoCientifica definicaoCientificaSave(@RequestBody DefinicaoCientifica definicaoCientifica) {
		return service.SaveDefinicaoCientifica(definicaoCientifica);
 	}
	
	@GetMapping("/{id}")
	public Optional<DefinicaoCientifica> listDefinicaoCientifica(@PathVariable Long id) {
	   return service.ListDefinicaoCientific(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		 service.deleteDefinicaoCi(id);
	}
}