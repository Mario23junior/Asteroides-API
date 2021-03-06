package com.project.asteroides.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.asteroides.Model.DetalhesDatas;

public interface RepositoryDetalhesDatas extends JpaRepository<DetalhesDatas, Long>{
  
	List<DetalhesDatas> findByClasseIgnoreCaseContaining(String classe);
}
