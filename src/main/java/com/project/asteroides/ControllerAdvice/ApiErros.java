package com.project.asteroides.ControllerAdvice;

import java.util.Arrays;
import java.util.List;

public class ApiErros {
   
	 
	private List<String> errors;
		
	public ApiErros(List<String> errors) {
			this.errors = errors;
	 }
		
	public ApiErros(String menssagemErro) {
			 this.errors = Arrays.asList(menssagemErro);
	}

	public List<String> getErrors() {
			return errors;
	}
	 	 
}
