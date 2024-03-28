package com.StudentDetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentDetails.entity.StudentdetailsEntity;
import com.StudentDetails.repository.StudentdetailsRepository;

@Repository
public class StudentdetailsDao {
	@Autowired
	StudentdetailsRepository studentrepo;
	public String get(List<StudentdetailsEntity> a) {
		studentrepo.saveAll(a);
		return "saved succesfully";
	}

	public String getter (StudentdetailsEntity e) {
		studentrepo.save(e);
		return "All records saved everything";
	}
	public List<StudentdetailsEntity> getAll( ) {
		return studentrepo.findAll();
	
	}

}
