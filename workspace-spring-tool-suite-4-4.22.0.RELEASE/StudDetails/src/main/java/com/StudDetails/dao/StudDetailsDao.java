package com.StudDetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudDetails.entity.StudDetailsEntity;
import com.StudDetails.repository.StudDetailsRepo;

@Repository
public class StudDetailsDao {
	@Autowired
	StudDetailsRepo studentrepo;
	public String getter(List<StudDetailsEntity> a) {
		studentrepo.saveAll(a);
		return "saved succesfully";
	}

	public String get(StudDetailsEntity e) {
		studentrepo.save(e);
		return "All records saved everything";
	}
	
	
}
