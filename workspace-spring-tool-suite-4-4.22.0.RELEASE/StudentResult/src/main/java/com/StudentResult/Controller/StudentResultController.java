package com.StudentResult.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.StudentResult.entity.StudentResultEntity;
import com.StudentResult.service.StudentResultService;
@RestController
public class StudentResultController {
	@Autowired
	RestTemplate resttemplate;
	@PostMapping("/getservice")
	public String get(@RequestBody List<StudentResultEntity> res) {
		String url = "http://localhost:8080/find";
		String url1 = "http://localhost:8081/get";
		// List<StudentResultEntity> res = new ArrayList<>();

		List<StudDetailsEntity> student = resttemplate
				.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<StudDetailsEntity>>() {
				}).getBody();
		List<StudmarksheetEntity> marks = resttemplate
				.exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<StudmarksheetEntity>>() {
				}).getBody();
		for (int i = 0; i < student.size(); i++) {
			StudentResultEntity result = new StudentResultEntity();
			for (int j = 0; j < marks.size(); j++) {
				if (student.get(i).getRoll_no() == marks.get(j).getRoll_no()) {
					result.setName(student.get(i).getName());

					result.setTotal((marks.get(j).getSem1_total() + marks.get(j).getSem2_total()) / 2);
					result.setRoll_no(student.get(i).getRoll_no());
					
				}
				if (student.get(i).getAttendance() >= 90 && result.getTotal() <= 95) {
					result.setTotal(result.getTotal() + 5);
					
				}
				result.setPercentage(result.getTotal());
				res.add(result);
			}
		}

		return StudentResultService.get(res);
	}
	
	@GetMapping("/find")
	public List<StudentResultEntity> find(@RequestParam int r) {
		return studentResultService.find(r);
	}
	@GetMapping("/findbetween")
	public List<StudentResultEntity> findbetween(@RequestParam float a,@RequestParam float b) {
	return studentResultService.findbetween(a,b);
	}
	}