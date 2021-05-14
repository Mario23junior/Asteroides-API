package com.project.asteroides.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.asteroides.Model.Asteroide;

public interface RepositoryAsteroides extends JpaRepository<Asteroide, Long>{

}
