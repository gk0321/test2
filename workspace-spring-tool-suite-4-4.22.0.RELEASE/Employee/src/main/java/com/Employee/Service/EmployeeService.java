package com.Employee.Service;


	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Employee.Dao.EmployeeDao;
import com.Employee.Entity.Employee;
import com.Employee.Exception.Customage;
import com.Employee.Exception.NoDataException;

	@Service
	public class EmployeeService {
		@Autowired
		EmployeeDao empdao;

		public String addEmployee(Employee e) {
			return empdao.addEmployee(e);
		}

		public Employee addEmployee1(int e) {
			return empdao.addEmployee1(e);
		}

		public List<Employee> addEmployee2() {
			return empdao.addEmployee2();
		}

		public String addEmployee3(Employee e) {
			return empdao.addEmployee3(e);
		}

		public String addEmployee4(int e) {
			return empdao.addEmployee4(e);
		}

		public String addEmployee5(List<Employee> e) {
			return empdao.addEmployee5(e);
		}

		public List<String> addEmployee6(int a) {
			List<Employee> z = empdao.addEmployee2();
			return z.stream().filter(x -> (x.getAge() < a)).map(x -> x.getFirstName()).toList();
		}      
		public List<Employee> addEmployee7(int a) {
			List<Employee> z = empdao.addEmployee2();
			return z.stream().filter(x ->(x.getSalary() > a)).toList();
		}
		public List<Employee> addEmployee8(String a) {
			List<Employee> z = empdao.addEmployee2();
			return z.stream().filter(x -> (x.getFirstName().equalsIgnoreCase(a))).toList();
		}
		public List<String> addEmployee9(int a) {
			List<Employee> z = empdao.addEmployee2();
			return z.stream().filter(x -> (x.getSalary() > a)).map(x->x.getDesignation()).toList();
		}
		public List<String> addEmployee10(String a) {
			List<Employee> z = empdao.addEmployee2();
			return z.stream().filter(x -> (x.getGender().equalsIgnoreCase(a))).map(x -> x.getFirstName()).toList();
		}
		public List<Employee> addEmployee11(String a) {
			List<Employee> z = empdao.addEmployee2();
			return z.stream().filter(x ->(x.getGender().equalsIgnoreCase(a))).toList();
		}
		public List<Employee> addEmployee12(String a) {
			List<Employee> z = empdao.addEmployee2();
			return z.stream().filter(x ->(x.getDesignation().equalsIgnoreCase(a))).toList();
		}
		public List<Employee> getbetween( int sal1, int sal2) {
			return empdao.getbetween(sal1,sal2);
		}
		public List<Employee> getbetweenorder( ) {
			return empdao.getbetweenorder();
		}
		public List<Object[]> getbetweenor1(String a ) {
			return empdao.getbetweenor1(a);
		}
		public List<Employee>getjpaq1() {
			return empdao.getjpaq1();
		}
		public List<Employee> getbetweennam( String nam1, String nam2) {
			return empdao.getbetweennam(nam1,nam2);
		}
		public List<Employee> getsal1(int nam1 ) {
			return empdao.getsal1(nam1);
		}
		public List<Employee>  getsal2( int nam1, int nam2) {
			return empdao.getsal2(nam1,nam2);
		}
		public List<Integer> getsal3(String nam1 ) {
			return empdao.getsal3(nam1);
		}
		public String age(Employee e) throws Exception {
			 try {
				if(e.getAge()>18) {
					return empdao.age(e);
					
				}
			 
			 else {
					throw new Customage("minor");
				}
		}
			 catch(Customage a) {
				 return "minor";
			 }
			
		}
		public List<Employee> getByName(String name) throws Exception {
			List<Employee> emp = empdao.addEmployee2();
			List<Employee> temp1 = emp.stream().filter(x -> x.getFirstName().equals(name)).toList();
			if (temp1.isEmpty()) {
				throw new NoDataException("Name Not Found");
			}
			else {
				return temp1;
			}
		}
	}

