package com.example.ABCElectronic_smartDevice.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobleExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleResourceNotFound(ResourceNotFoundException rnf, WebRequest request)
	{
		ErrorDetails error=new ErrorDetails(new Date(),rnf.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(InValidComplaintIdException.class)
	public ResponseEntity<?> handlerCustomerAlreadyExistsException(InValidComplaintIdException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InValidClientIdException.class)
	public ResponseEntity<?> handlerCustomerAlreadyExistsException(InValidClientIdException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InValidDomainException.class)
	public ResponseEntity<?> handlerCustomerAlreadyExistsException(InValidDomainException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
  
	@ExceptionHandler(InValidEngineerIdException .class)
	public ResponseEntity<?> handlerCustomerAlreadyExistsException(InValidEngineerIdException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(InValidModelNumberException.class)
	public ResponseEntity<?> handleModelNumberException(InValidModelNumberException ex, WebRequest request)
	{
		ErrorDetails error=new ErrorDetails(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(OutOfWarrantyException.class)
	public ResponseEntity<?> handlerCustomerAlreadyExistsException(OutOfWarrantyException ex, WebRequest request) {
		ErrorDetails error = new ErrorDetails(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}

}
