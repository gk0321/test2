package com.example.StudentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentEntity.StudentEntity;

@Repository
public class StudentDao {
@Autowired
StudentRep studentrepo;
public String get(StudentEntity a) {
	studentrepo.save(a);
	return "saved succesfully";
}

public String getter (List<StudentEntity> e) {
	studentrepo.saveAll(e);
	return "All records saved everything";
}

}
