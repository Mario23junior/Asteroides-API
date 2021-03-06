package com.project.asteroides.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.asteroides.Controller.Service.ServiceAsteroide;
import com.project.asteroides.Model.Asteroide;

@RequestMapping("/api/v1/asteroides")
@RestController
public class ControllerAsteroides {
    
	private ServiceAsteroide dataService;
	
	public ControllerAsteroides(ServiceAsteroide dataService) {
 		this.dataService = dataService;
 	}
	
	@PostMapping("/")
	public Asteroide save(@RequestBody @Valid Asteroide asteroide) {
		 return dataService.save(asteroide);
	}
	
	@GetMapping("/{id}")
	public Optional<Asteroide> listById(@PathVariable Long id) {
 	    return dataService.listId(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		dataService.delete(id);
 	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable Long id, @RequestBody @Valid Asteroide asteroide) {
		dataService.update(id, asteroide);
	}
	
	@GetMapping("/page/{pageNo}/{pageSize}")
	public List<Asteroide> pagination(@PathVariable int pageNo, @PathVariable int pageSize){
		return dataService.pagination(pageNo, pageSize);
	}
}