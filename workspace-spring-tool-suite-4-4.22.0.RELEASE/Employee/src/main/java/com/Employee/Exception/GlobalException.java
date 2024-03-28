package com.Employee.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.Employee.Entity.Employee;

@RestControllerAdvice
public class GlobalException {
@ExceptionHandler(value=NoDataException.class)
public ResponseEntity<Object> noDataExceptionHandling(NoDataException nod) {
	return new ResponseEntity<>(nod.getMessage(),HttpStatus.NOT_FOUND);
}
@ExceptionHandler(value=NullPointerException.class)
public ResponseEntity<Object> Nullpoint( NullPointerException nod1) {
	return new ResponseEntity<>(nod1.getMessage(),HttpStatus.NOT_FOUND);
}
}
