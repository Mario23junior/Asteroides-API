package com.project.asteroides.ControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.project.asteroides.Exception.ObjectByReturnToEmpty;

@RestControllerAdvice
public class ControllerAdviceErro {
      
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ApiErros handleMethodNotValidException(MethodArgumentNotValidException ex) {
		List<String> errors = ex.getBindingResult().getAllErrors()
				   .stream()
				   .map(erro -> erro.getDefaultMessage())
				   .collect(Collectors.toList());
		return new ApiErros(errors);
	}
	
	
 	@ExceptionHandler(ObjectByReturnToEmpty.class)
	public ApiErros hendleObjectByReturnToEmpty(ObjectByReturnToEmpty ex) {
		return new ApiErros(ex.getMessage());
	}
	
	
}
