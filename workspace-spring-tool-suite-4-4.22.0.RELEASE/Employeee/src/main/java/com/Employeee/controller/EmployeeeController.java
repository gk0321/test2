package com.Employeee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Employeee.entity.EmployeeeEntity;
import com.Employeee.service.EmployeeeService;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeeController {
	@Autowired
	EmployeeeService empser;
	@PostMapping(value = "/insert")
	public String addEmployee(@RequestBody EmployeeeEntity e) throws NullPointerException {
		if(e.getGender() ==null) {
			throw new NullPointerException("enter gender");
		}
		else if(e.getAge()==0) {
			throw new NullPointerException("enter age");
		}
		else {
		return empser.addEmployee(e);
	}
	}

	@GetMapping(value = "/getting/{e}")
	public EmployeeeEntity addEmployee1(@PathVariable int e) {
		return empser.addEmployee1(e);
	}

	@GetMapping(value = "/getter")
	public List<EmployeeeEntity> addEmployee2() {
		return empser.addEmployee2();
	}

	@PutMapping(value = "/insert1")
	public String addEmployee3(@RequestBody EmployeeeEntity e) {
		return empser.addEmployee3(e);
	}

	@DeleteMapping(value = "/delete/{e}")
	public String addEmployee4(@PathVariable int e) {
		return empser.addEmployee4(e);
	}

	@PostMapping(value = "/insertlist")
	public String addEmployee5(@RequestBody List<EmployeeeEntity> e) {
		return empser.addEmployee5(e);
	}

	@GetMapping(value = "/getfname/{a}")
	public List<String> addEmployee6(@PathVariable int a) {
		return empser.addEmployee6(a);
	}

	@GetMapping(value = "/getobj1/{a}")
	public List<EmployeeeEntity> addEmployee7(@PathVariable int a) {
		return empser.addEmployee7(a);
	}

	@GetMapping(value = "/getobj2/{a}")
	public List<EmployeeeEntity> addEmployee8(@PathVariable String a) {
		return empser.addEmployee8(a);
	}

	@GetMapping(value = "/getobj3/{a}")
	public List<String> addEmployee9(@PathVariable int a) {
		return empser.addEmployee9(a);
	}

	@GetMapping(value = "/getobj4/{a}")
	public List<String> addEmployee10(@PathVariable String a) {
		return empser.addEmployee10(a);
	}

	@GetMapping(value = "/getobj5/{a}")
	public List<EmployeeeEntity> addEmployee11(@PathVariable String a) {
		return empser.addEmployee11(a);
	}

	@GetMapping(value = "/getobj6/{a}")
	public List<EmployeeeEntity> addEmployee12(@PathVariable String a) {
		return empser.addEmployee12(a);
	}

	@GetMapping(value = "getobj7/{sal1}/{sal2}")
	public List<EmployeeeEntity> getbetween(@PathVariable int sal1, @PathVariable int sal2) {
		return empser.getbetween(sal1, sal2);

	}

	@GetMapping(value = "getobj8")
	public List<EmployeeeEntity> getbetweenorder() {
		return empser.getbetweenorder();
	}

	@GetMapping(value = "getobj9/{a}")
	public List<Object[]> getbetweenor1(@PathVariable String a) {
		return empser.getbetweenor1(a);
	}

	@GetMapping(value = "getobj10")
	public List<EmployeeeEntity> getjpaq1() {
		return empser.getjpaq1();
	}
	@GetMapping(value = "/getobj11/{nam1}/{nam2}")
	public List<EmployeeeEntity> getbetweennam(@PathVariable String nam1, @PathVariable String nam2) {
		return empser.getbetweennam(nam1, nam2);

	}
  @GetMapping(value = "/getobj12/{nam1}")
	public List<EmployeeeEntity> getsal1(@PathVariable int nam1) {
		return empser.getsal1(nam1);
}
  @GetMapping(value = "/getobj13")
	public List<EmployeeeEntity> getsal2(@RequestParam int nam1,@RequestParam int nam2) {
		return empser.getsal2(nam1,nam2);
}
  @GetMapping(value = "/getobj14")
	public List<Integer> getsal3(@RequestParam String nam1) {
		return empser.getsal3(nam1);
}
  @PostMapping(value = "/getobj15")
	public String getsal4(@RequestBody EmployeeeEntity e)throws Exception {
		return empser.age(e);
}
  @GetMapping("/getByName/{name}")
	public List<EmployeeeEntity> getByName(@PathVariable String name) throws Exception {
		return empser.getByName(name);
	}
  
  
}
