package com.project.asteroides.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.asteroides.Controller.Service.ServiceDefinicaoCientifica;

@RequestMapping("/api/v1/definicaoCientifica")
@RestController
public class ControllerDefinicaoCientifica {
    
	private ServiceDefinicaoCientifica service;
	
	public ControllerDefinicaoCientifica(ServiceDefinicaoCientifica service) {
		this.service = service;
 	}
	
	
}
