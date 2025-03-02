package com.StudDetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudDetails.dao.StudDetailsDao;
import com.StudDetails.entity.StudDetailsEntity;
import com.StudDetails.exception.AgeNotFound;


@Service
public class StudDetailsService {
	@Autowired
	StudDetailsDao studao;
	public String getter(List<StudDetailsEntity> a) {
		return studao.getter(a);
	}
	public String get(StudDetailsEntity a)throws Exception {
		if(a.getAge()<18) {
			return studao.get(a);
		} else {
		  throw new AgeNotFound("age not valid");
		}
	}
}
