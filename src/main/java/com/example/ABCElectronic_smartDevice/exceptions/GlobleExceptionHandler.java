package com.example.ABCElectronic_smartDevice.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobleExceptionHandler {

	@ExceptionHandler(InValidComplaintIdException.class)
	public ResponseEntity<?> handlerCustomerAlreadyExistsException(InValidComplaintIdException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	
	
	@ExceptionHandler(InValidDomainException .class)
	public ResponseEntity<?> handlerCustomerAlreadyExistsException(InValidDomainException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	@ExceptionHandler(InValidEngineerIdException .class)
	public ResponseEntity<?> handlerCustomerAlreadyExistsException(InValidEngineerIdException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(OutOfWarrantyException .class)
	public ResponseEntity<?> handlerCustomerAlreadyExistsException(OutOfWarrantyException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handlerResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(ProductAllreadyExistException.class)
	public ResponseEntity<?> handlerProductAllreadyExistException(ProductAllreadyExistException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	
}
}
