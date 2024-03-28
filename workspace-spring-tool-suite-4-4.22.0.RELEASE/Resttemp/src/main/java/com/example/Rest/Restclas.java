package com.example.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restclas {
//@RequestMapping(value = "/employees")
	@GetMapping(value = "/getHi")
	public String getHi() {
		return "Hi";
	}
}