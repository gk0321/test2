package com.Employeee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Employeee.Repository.Employeeerepo;
import com.Employeee.entity.EmployeeeEntity;


@Repository
public class EmployeeeDao {
	@Autowired
	Employeeerepo emprepo;

	public String addEmployee(EmployeeeEntity e) {
		emprepo.save(e);
		return "Sucessfuly saved";
	}

	public EmployeeeEntity addEmployee1(int e) {
		return emprepo.findById(e).get();

	}

	public List<EmployeeeEntity> addEmployee2() {
		return emprepo.findAll();
	}

	public String addEmployee3(EmployeeeEntity e) {
		emprepo.save(e);
		return "Sucessfuly updated";
	}

	public String addEmployee4(int e) {
		emprepo.deleteById(e);
		return "Sucessfully deleted";
	}

	public String addEmployee5 (List<EmployeeeEntity> e) {
		emprepo.saveAll(e);
		return "Sucessfuly saved everything";
	}
	public List<EmployeeeEntity>getbetween(int sal1, int sal2) {
		return emprepo.getByBetweensalary(sal1,sal2);
		
	}
	public List<EmployeeeEntity>getbetweenorder() {
		return emprepo.getbybetweenorder();
		
	}
	public List<Object[]>getbetweenor1(String a) {
		return emprepo.getuseof(a);
		
	}
	public List<EmployeeeEntity>getjpaq1() {
		return emprepo.getjpaq1();
		
	}
	public List<EmployeeeEntity>getbetweennam( String nam1, String nam2) {
		return emprepo.getbybetweennam(nam1,nam2);
		
	}
	public List<EmployeeeEntity> getsal1(int nam1) {
		return emprepo.getsalary2(nam1);
		
	}
	public List<EmployeeeEntity>  getsal2( int nam1, int nam2) {
		return emprepo.getsal2(nam1,nam2);
	}
	
	public List<Integer> getsal3(String nam1) {
		return emprepo.getsal3(nam1);
		
	}
	public String age(EmployeeeEntity e) {
		emprepo.save(e);
		return "save succesfully";
	}
}