package com.example.Student.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.Student.Entity.student;
import com.example.Student.dao.dao;

import jakarta.persistence.Entity;
@org.springframework.stereotype.Service
public class Service {
	@Autowired
	dao studao;

	public String insertall(List<student> e) {
		return studao.insertall(e);
	}

	public List<student> getall() {
		return studao.getall();
	}

	public List<Integer> passedout( String a,String b) {
		List<student> all = studao.getall();
		return all.stream().filter(x -> x.getStname().equals(a)).filter(x -> x.getCourse().equals(b))
				.map(x -> x.getYear()).toList();
	}

	public String update(List<student> e) {
		return studao.update(e);

	}

	public Map<Integer, List<student>> detail(String c) {
		List<student> all = studao.getall();
		Map<Integer, List<student>> det = all.stream().filter(x -> x.getCourse().equalsIgnoreCase(c))
				.collect(Collectors.groupingBy(student::getYear));
		return det;

	}

	public String delName(String name) {
		List<student> all = studao.getall();
		List<student> a = all.stream().filter(x -> x.getStname().equalsIgnoreCase(name)).toList();
		for (int i = 1; i < a.size(); i++) {
			student s = a.get(i);
			Integer n = s.getId();
			studao.dele(n);
		}

		return "Deleted successfully";

	}

}
