package com.Employee.Dao;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Employee.Entity.Employee;
import com.Employee.Repository.EmployeeRepository;

	@Repository
	public class EmployeeDao {
		@Autowired
		EmployeeRepository emprepo;

		public String addEmployee(Employee e) {
			emprepo.save(e);
			return "Sucessfuly saved";
		}

		public Employee addEmployee1(int e) {
			return emprepo.findById(e).get();

		}

		public List<Employee> addEmployee2() {
			return emprepo.findAll();
		}

		public String addEmployee3(Employee e) {
			emprepo.save(e);
			return "Sucessfuly updated";
		}

		public String addEmployee4(int e) {
			emprepo.deleteById(e);
			return "Sucessfully deleted";
		}

		public String addEmployee5 (List<Employee> e) {
			emprepo.saveAll(e);
			return "Sucessfuly saved everything";
		}
		public List<Employee>getbetween(int sal1, int sal2) {
			return emprepo.getByBetweensalary(sal1,sal2);
			
		}
		public List<Employee>getbetweenorder() {
			return emprepo.getbybetweenorder();
			
		}
		public List<Object[]>getbetweenor1(String a) {
			return emprepo.getuseof(a);
			
		}
		public List<Employee>getjpaq1() {
			return emprepo.getjpaq1();
			
		}
		public List<Employee>getbetweennam( String nam1, String nam2) {
			return emprepo.getbybetweennam(nam1,nam2);
			
		}
		public List<Employee> getsal1(int nam1) {
			return emprepo.getsalary2(nam1);
			
		}
		public List<Employee>  getsal2( int nam1, int nam2) {
			return emprepo.getsal2(nam1,nam2);
		}
		
		public List<Integer> getsal3(String nam1) {
			return emprepo.getsal3(nam1);
			
		}
		public String age(Employee e) {
			emprepo.save(e);
			return "save succesfully";
		}
	}
	

