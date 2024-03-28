package com.example.StudentMarkSheet.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.StudentMarkSheet.Dao.MarksheetDao;
import com.example.StudentMarkSheet.Entity.StudentMarkSheet;

@Service
public class MarksheetService {
@Autowired
MarksheetDao markdao;
public String findTotal1(List<StudentMarkSheet> a) {
	for (StudentMarkSheet x : a) {
		x.setSem1Total(x.getSem1Practicals() + x.getSem1Theory());
		x.setSem2Total(x.getSem2Pracxticals() + x.getSem2Theory());
	}
	return markdao.geter(a);
}
}
