package com.employee.serviceImpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.employee.entity.EducationDetails;
import com.employee.entity.Employee;
import com.employee.entity.EmploymentHistory;
import com.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public List<Employee> createEmployee() {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(createEmployeeObject("Pratik", 20, "Developer", "BETECH", 
				75, LocalDate.parse("2016-06-12"), "GlobalLogic", 4.2, "Boot Camp"));
		empList.add(createEmployeeObject("Parshuram", 21, "Tester", "BETECH", 
				75, LocalDate.parse("2017-06-12"), "GlobalLogic", 3, "Boot Camp"));
		empList.add(createEmployeeObject("Yuteen", 22, "Manager", "BETECH", 
				75, LocalDate.parse("2017-06-27"), "GlobalLogic", 1, "Allocate"));
		empList.add(createEmployeeObject("Jimmy", 23, "Admin", "BETECH", 
				75, LocalDate.parse("2018-06-12"), "GlobalLogic",2, "Telus"));
		
		return empList;
	}

	@Override
	public void findDeveleoperEmployee(List<Employee> empList) {
		empList.stream().filter(emp -> emp.getDesignation().equals("Developer"))
						.forEach(System.out::println);
	}

	@Override
	public void findAllEmployeeSameCompany(List<Employee> empList) {
		
		List<String> listEmp = new ArrayList<>();
		Set<String> setEmp = new HashSet<>(); 
		empList.forEach(emp->{
			listEmp.add(emp.getEmpName());
			setEmp.add(emp.getEmpName());
		});
		
		for(String enameList : listEmp) {
			for(String enameSet : setEmp) {
				if(enameSet.equals(enameList)) {
					System.out.println(enameSet);		
				}
			}
		}
	}

	@Override
	public void findAllEmployeeWithExperience(List<Employee> empList) {
		empList.stream().filter(emp -> emp.getEmploymentHistory().getDuration() >= 2 
															&& emp.getDesignation().equals("Developer"))
						.forEach(System.out::println);
	}
	
	public Employee createEmployeeObject(String empName,Integer age,
					String designation,String degreeName,double avgMarks,LocalDate date,
					String nameOfOrganization,double duration,String projectName) {
		
		Employee employee = new Employee();
		employee.setEmpName(empName);
		employee.setAge(age);
		employee.setDesignation(designation);
		employee.setEducationDetails(new EducationDetails(degreeName,avgMarks,date));
		employee.setEmploymentHistory(new EmploymentHistory(nameOfOrganization,
				duration,
				projectName));
		
		return employee;
	}

}
