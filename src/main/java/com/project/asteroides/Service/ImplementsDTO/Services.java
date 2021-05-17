package com.project.asteroides.Service.ImplementsDTO;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.project.asteroides.DTOModel.AsteroideDTO;
import com.project.asteroides.Model.Asteroide;
import com.project.asteroides.Repository.RepositoryAsteroides;
import com.project.asteroides.Service.ServiceDTOImplements;

@Service
public class Services implements ServiceDTOImplements {

	private RepositoryAsteroides repositoryAsteroides;

	private ModelMapper modelMapper;

	public Services(RepositoryAsteroides repositoryAsteroides, ModelMapper modelMapper) {
		this.repositoryAsteroides = repositoryAsteroides;
		this.modelMapper = modelMapper;
	}

	public List<AsteroideDTO> listByDataAsteroide() {
		return ((List<Asteroide>) repositoryAsteroides
				.findAll())
				.stream()
				.map(this::ConverterEntityToDTO)
				.collect(Collectors.toList());
	}

	public AsteroideDTO ConverterEntityToDTO(Asteroide asteroide) {
		modelMapper.getConfiguration()
		.setMatchingStrategy(MatchingStrategies.LOOSE);
		AsteroideDTO asteroideDTO = modelMapper
				.map(asteroide, AsteroideDTO.class);
		return asteroideDTO;
	}

	public List<AsteroideDTO> listAllData() {
		List<AsteroideDTO> list = listByDataAsteroide();
		return list.stream()
				.collect(Collectors.toList());
	}

}
