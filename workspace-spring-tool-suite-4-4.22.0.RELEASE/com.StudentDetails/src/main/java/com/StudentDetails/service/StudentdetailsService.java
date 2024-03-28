package com.StudentDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentDetails.Exception.AgeNotFound;
import com.StudentDetails.dao.StudentdetailsDao;
import com.StudentDetails.entity.StudentdetailsEntity;

@Service
public class StudentdetailsService {
	@Autowired
	StudentdetailsDao studao;
	public String get(List<StudentdetailsEntity> a) {
		return studao.get(a);
	}
	public String getter(StudentdetailsEntity a)throws Exception {
		if(a.getAge()<18) {
			return studao.getter(a);
		} else {
		  throw new AgeNotFound("age not valid");
		}
	}
	public List<StudentdetailsEntity> getAll( ) {
		return studao.getAll();
	
	}
}
