package com.example.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StudentDao.StudentDao;
import com.example.StudentEntity.StudentEntity;
import com.example.Studentxception.AgeNotFound;
@Service
public class StudentService {
@Autowired
StudentDao studao;
public String get(List<StudentEntity> a) {
	return studao.get(a);
}
public String getter(StudentEntity a)throws Exception {
	if(a.getAge()<18) {
		return studao.getter(a);
	} else {
	  throw new AgeNotFound("age not valid");
	}
}
}
