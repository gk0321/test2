package com.example.Studentxception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalException {
	@ExceptionHandler(value=AgeNotFound.class)
   public ResponseEntity<Object>globalexception(AgeNotFound a) {
	   return new ResponseEntity<Object>(a.getMessage(),HttpStatus.BAD_REQUEST);
   }
}
