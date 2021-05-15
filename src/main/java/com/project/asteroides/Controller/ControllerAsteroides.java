package com.project.asteroides.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.asteroides.Model.Asteroide;
import com.project.asteroides.Service.DataService;

@RequestMapping("/api/v1/asteroides")
@RestController
public class ControllerAsteroides {
    
	private DataService dataService;
	
	public ControllerAsteroides(DataService dataService) {
 		this.dataService = dataService;
 	}
	
	@PostMapping("/")
	public Asteroide save(@RequestBody Asteroide asteroide) {
		 return dataService.save(asteroide);
	}
	
	@GetMapping("/{id}")
	public Optional<Asteroide> listAll(@PathVariable Long id) {
 	    return dataService.listAll(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		dataService.delete(id);
 	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable Long id, @RequestBody Asteroide asteroide) {
		dataService.update(id, asteroide);
	}
}