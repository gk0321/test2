package com.StudentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentDetails.entity.StudentdetailsEntity;
import com.StudentDetails.service.StudentdetailsService;

@RestController
public class StudentdetailsController {
	@Autowired
	StudentdetailsService stuserv;
	@PostMapping("/insert")
	public String get(@RequestBody List<StudentdetailsEntity> a) {
		return stuserv.get(a);
	}
	@PostMapping("/validate")
	public String getter(@RequestBody StudentdetailsEntity a)throws Exception {
		return stuserv.getter(a);
	}
	@GetMapping("/getall")
	public List<StudentdetailsEntity>  getAll( ) {
		return stuserv.getAll();
	
	}
	
}
