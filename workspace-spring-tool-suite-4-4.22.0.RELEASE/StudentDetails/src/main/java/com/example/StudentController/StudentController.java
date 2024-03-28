package com.example.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.StudentEntity.StudentEntity;
import com.example.StudentService.StudentService;

@RestController

public class StudentController extends Exception{
@Autowired
StudentService stuserv;
@PostMapping("/insert")
public String get(@RequestBody List<StudentEntity> a) {
	return stuserv.get(a);
}
@PostMapping("/validate")
public String getter(@RequestBody StudentEntity a)throws Exception {
	return stuserv.getter(a);
}

}
