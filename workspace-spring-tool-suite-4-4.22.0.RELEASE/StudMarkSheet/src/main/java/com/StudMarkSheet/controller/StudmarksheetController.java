package com.StudMarkSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.StudMarkSheet.entity.StudmarksheetEntity;
import com.StudMarkSheet.service.StudmarksheetService;

@RestController
public class StudmarksheetController {
	@Autowired
	StudmarksheetService markserv;
	@PostMapping(value="/insertall") 
	public String findTotal1(@RequestBody List<StudmarksheetEntity> e) {
		return markserv.findTotal1(e);
	}
}
