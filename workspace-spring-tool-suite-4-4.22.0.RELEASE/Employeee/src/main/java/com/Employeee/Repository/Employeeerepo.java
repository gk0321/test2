package com.Employeee.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.Employeee.entity.EmployeeeEntity;
public interface Employeeerepo extends JpaRepository<EmployeeeEntity,Integer>{
	@Query(value = "select*from employees where salary>=? and salary<=?", nativeQuery = true)
	public List<EmployeeeEntity> getByBetweensalary(int sal1, int sal2);

	@Query(value = "select*from employees order by age", nativeQuery = true)
	public List<EmployeeeEntity> getbybetweenorder();

	@Query(value = "select first_name,designation from employees where first_name=?", nativeQuery = true)
	public List<Object[]> getuseof(String a);

	@Query(value = "select e from Employee e")
	public List<EmployeeeEntity> getjpaq1();

	@Query(value = "select e from Employee e where e.firstName like ?1 and e.secondName like ?2")
	public List<EmployeeeEntity> getbybetweennam(String nam1, String nam2);
	@Query(value = "select e from Employee e where e.salary=?1")
	public List<EmployeeeEntity> getsalary2(int nam1);
	@Query(value = "select e from Employee e where e.age<= ?1 and e.age>= ?2")
	public List<EmployeeeEntity> getsal2(int nam1,int nam2);
	@Query(value = "select e.salary from Employee e  where e.firstName like :nam1")
	public List<Integer> getsal3(String nam1);
    
}