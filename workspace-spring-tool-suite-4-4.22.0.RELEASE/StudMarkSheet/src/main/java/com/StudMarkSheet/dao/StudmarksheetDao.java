package com.StudMarkSheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudMarkSheet.entity.StudmarksheetEntity;
import com.StudMarkSheet.repository.StudmarksheetRepo;

@Repository
public class StudmarksheetDao {
	@Autowired
	StudmarksheetRepo  markrepo;
	public String geter(List<StudmarksheetEntity> a) {
		markrepo.saveAll(a);
		return "saved";

	}
}
