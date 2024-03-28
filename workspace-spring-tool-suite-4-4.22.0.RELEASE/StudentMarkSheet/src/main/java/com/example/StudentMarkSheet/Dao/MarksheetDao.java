package com.example.StudentMarkSheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentMarkSheet.Entity.StudentMarkSheet;
import com.example.StudentMarkSheet.Repository.StudentmarksheetRepository;

@Repository
public class MarksheetDao {
@Autowired
StudentmarksheetRepository  markrepo;
public String geter(List<StudentMarkSheet> a) {
	markrepo.saveAll(a);
	return "saved";

}
}
