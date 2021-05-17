package com.project.asteroides.ControllerDTO;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.asteroides.DTOModel.AsteroideDTO;
import com.project.asteroides.Service.ServiceDTOImplements;

@RequestMapping("/api/v1/list/asteroidesDetalhes")
@RestController
public class ControllerDTO {
  
	private ServiceDTOImplements serviceDTO;
	
	public ControllerDTO(ServiceDTOImplements serviceDTO) {
		 this.serviceDTO = serviceDTO;
 	}
	
	@GetMapping("/")
	public List<AsteroideDTO> listAllDetalhesDTO(){
		return serviceDTO.listAllData();
	}
}
