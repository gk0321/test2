package com.StudMarkSheet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudMarkSheet.dao.StudmarksheetDao;
import com.StudMarkSheet.entity.StudmarksheetEntity;


@Service
public class StudmarksheetService {
	@Autowired
	StudmarksheetDao markdao;
	public String findTotal1(List<StudmarksheetEntity> a) {
		for (StudmarksheetEntity x : a) {
			x.setSem1Total(x.getSem1Practicals() + x.getSem1Theory());
			x.setSem2Total(x.getSem2Pracxticals() + x.getSem2Theory());
		}
		return markdao.geter(a);
	}
}
