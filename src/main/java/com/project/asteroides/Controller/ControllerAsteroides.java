package com.project.asteroides.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.asteroides.Model.Asteroide;
import com.project.asteroides.Repository.RepositoryAsteroides;

@RequestMapping("/api/v1/asteroides")
@RestController
public class ControllerAsteroides {
    
	private RepositoryAsteroides repositoryAsteroides;
	
	public ControllerAsteroides(RepositoryAsteroides repositoryAsteroides ) {
		this.repositoryAsteroides = repositoryAsteroides;
 	}
	
	@PostMapping("/")
	public Asteroide save(@RequestBody Asteroide asteroide) {
		Asteroide asteroidResult = repositoryAsteroides.save(asteroide);
		return asteroidResult;
	}
	
	@GetMapping("/{id}")
	public Optional<Asteroide> listAll(@PathVariable Long id) {
	    Optional<Asteroide> list = repositoryAsteroides.findById(id);
	    return list;
	}
}
