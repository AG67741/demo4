package com.training.restapiexample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.training.restapiexample.exceptions.NoBookFoundException;

@RestControllerAdvice
public class BookExceptionHandler {

	@ExceptionHandler(NoBookFoundException.class)
	public ResponseEntity<Object> handleNoBookFoundException(){
		return new ResponseEntity<>("Book Not Found",HttpStatus.NOT_FOUND);
	}
}
