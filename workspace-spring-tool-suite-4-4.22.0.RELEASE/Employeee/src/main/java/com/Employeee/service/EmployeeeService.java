package com.Employeee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employeee.Exception.CustomAge;
import com.Employeee.Exception.NoDataException;
import com.Employeee.dao.EmployeeeDao;
import com.Employeee.entity.EmployeeeEntity;

@Service
public class EmployeeeService {
	@Autowired
	EmployeeeDao empdao;

	public String addEmployee(EmployeeeEntity e) {
		return empdao.addEmployee(e);
	}

	public EmployeeeEntity addEmployee1(int e) {
		return empdao.addEmployee1(e);
	}

	public List<EmployeeeEntity> addEmployee2() {
		return empdao.addEmployee2();
	}

	public String addEmployee3(EmployeeeEntity e) {
		return empdao.addEmployee3(e);
	}

	public String addEmployee4(int e) {
		return empdao.addEmployee4(e);
	}

	public String addEmployee5(List<EmployeeeEntity> e) {
		return empdao.addEmployee5(e);
	}

	public List<String> addEmployee6(int a) {
		List<EmployeeeEntity> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getAge() < a)).map(x -> x.getFirstName()).toList();
	}      
	public List<EmployeeeEntity> addEmployee7(int a) {
		List<EmployeeeEntity> z = empdao.addEmployee2();
		return z.stream().filter(x ->(x.getSalary() > a)).toList();
	}
	public List<EmployeeeEntity> addEmployee8(String a) {
		List<EmployeeeEntity> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getFirstName().equalsIgnoreCase(a))).toList();
	}
	public List<String> addEmployee9(int a) {
		List<EmployeeeEntity> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getSalary() > a)).map(x->x.getDesignation()).toList();
	}
	public List<String> addEmployee10(String a) {
		List<EmployeeeEntity> z = empdao.addEmployee2();
		return z.stream().filter(x -> (x.getGender().equalsIgnoreCase(a))).map(x -> x.getFirstName()).toList();
	}
	public List<EmployeeeEntity> addEmployee11(String a) {
		List<EmployeeeEntity> z = empdao.addEmployee2();
		return z.stream().filter(x ->(x.getGender().equalsIgnoreCase(a))).toList();
	}
	public List<EmployeeeEntity> addEmployee12(String a) {
		List<EmployeeeEntity> z = empdao.addEmployee2();
		return z.stream().filter(x ->(x.getDesignation().equalsIgnoreCase(a))).toList();
	}
	public List<EmployeeeEntity> getbetween( int sal1, int sal2) {
		return empdao.getbetween(sal1,sal2);
	}
	public List<EmployeeeEntity> getbetweenorder( ) {
		return empdao.getbetweenorder();
	}
	public List<Object[]> getbetweenor1(String a ) {
		return empdao.getbetweenor1(a);
	}
	public List<EmployeeeEntity>getjpaq1() {
		return empdao.getjpaq1();
	}
	public List<EmployeeeEntity> getbetweennam( String nam1, String nam2) {
		return empdao.getbetweennam(nam1,nam2);
	}
	public List<EmployeeeEntity>getsal1(int nam1 ) {
		return empdao.getsal1(nam1);
	}
	public List<EmployeeeEntity>  getsal2( int nam1, int nam2) {
		return empdao.getsal2(nam1,nam2);
	}
	public List<Integer> getsal3(String nam1 ) {
		return empdao.getsal3(nam1);
	}
	public String age(EmployeeeEntity e) throws Exception {
		 try {
			if(e.getAge()>18) {
				return empdao.age(e);
				
			}
		 
		 else {
				throw new CustomAge("minor");
			}
	}
		 catch(CustomAge a) {
			 return "minor";
		 }
	}
	public List<EmployeeeEntity> getByName(String name) throws Exception {
		List<EmployeeeEntity> emp = empdao.addEmployee2();
		List<EmployeeeEntity> temp1 = emp.stream().filter(x -> x.getFirstName().equals(name)).toList();
		if (temp1.isEmpty()) {
			throw new NoDataException("Name Not Found");
		}
		else {
			return temp1;
		}
	}
}
