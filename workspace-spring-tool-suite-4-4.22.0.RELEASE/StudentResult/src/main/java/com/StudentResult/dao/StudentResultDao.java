package com.StudentResult.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentResult.entity.StudentResultEntity;
import com.StudentResult.repository.StudentResultRepo;
@Repository
public class StudentResultDao {
	@Autowired
	StudentResultRepo studentresultrepository;

	public String get(List<StudentResultEntity> a) {
		studentresultrepository.saveAll(a);
		return "inserted";
	}

}
