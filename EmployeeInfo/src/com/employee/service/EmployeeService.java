package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> createEmployee();
	public void findDeveleoperEmployee(List<Employee> empList);
	public void findAllEmployeeSameCompany(List<Employee> empList);
	public void findAllEmployeeWithExperience(List<Employee> empList);
}
