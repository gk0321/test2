package com.example.StudentMarkSheet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentMarkSheet.Entity.StudentMarkSheet;
import com.example.StudentMarkSheet.Service.MarksheetService;

@RestController
public class MarksheetController {
@Autowired
MarksheetService markserv;
@PostMapping(value="/insertall") 
public String findTotal1(@RequestBody List<StudentMarkSheet> e) {
	return markserv.findTotal1(e);
}

}
