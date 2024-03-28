package com.Vehicledetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Vehdet {
	@GetMapping(value = "/getHi")
	public String getHello() {
		return "Hello World";
	}
}
