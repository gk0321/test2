package com.example.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.product.Entity.Product;
import com.example.product.Service.service;

@RestController
@RequestMapping(value="/product")
public class controller {
	@Autowired
	service prdserv;
	@PostMapping("/insertAll")
	public  String insertall(@RequestBody List<Product> e) {
		return prdserv.insertall(e);

	}
}