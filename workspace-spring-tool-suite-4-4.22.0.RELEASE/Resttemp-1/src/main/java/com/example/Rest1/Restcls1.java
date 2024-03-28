package com.example.Rest1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Restcls1 {
	@Autowired
RestTemplate res;
	@GetMapping(value="/getHaiHello")
	public String getHiHello() {
		String url="http://localhost:8080/getHi";
		ResponseEntity<String> resp =res.exchange(url,HttpMethod.GET,null,String.class);
		String val=resp.getBody();
		return val;
	}	
}
