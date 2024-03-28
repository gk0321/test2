package com.example.Student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Student.Entity.student;
import com.example.Student.repo.studentrepo;

import jakarta.persistence.Entity;
@Repository
public class dao {
	@Autowired
	studentrepo sturep;

	public String insertall(List<student> e) {
		sturep.saveAll(e);
		return "All record saved succesfully";
	}

	public List<student> getall() {
		return sturep.findAll();
	}

	public String update(List<student> e) {
		sturep.saveAll(e);
		return "saved succesfully";
	}

	public String dele(int a) {
		sturep.deleteById(a);
		return "delete succesfully";

	}
}
