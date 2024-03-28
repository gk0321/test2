package com.StudDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudDetails.entity.StudDetailsEntity;
import com.StudDetails.service.StudDetailsService;

@RestController
public class StudDetailsController {
	@Autowired
	StudDetailsService stuserv;
	@PostMapping("/insert")
	public String getter(@RequestBody List<StudDetailsEntity> a) {
		return stuserv.getter(a);
	}
	@PostMapping("/validate")
	public String get(StudDetailsEntity a)throws Exception {
		return stuserv.get(a);
	}
}
