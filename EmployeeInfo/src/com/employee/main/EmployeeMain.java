package com.employee.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import com.employee.serviceImpl.EmployeeServiceImpl;

public class EmployeeMain {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("======Welcome Employee=====");
		List<Employee> empList = new ArrayList<>();
		while(true) {
		System.out.println("1.Create Employee");
		System.out.println("2.Find Employee who are developers");
		System.out.println("3.Find Employee who have not worked in other organizations");
		System.out.println("4.Find Employee who have experience more than two years and are developers");
		EmployeeService employeeService = new EmployeeServiceImpl();
		int option = sc.nextInt();
		if(option==1) {
			empList = employeeService.createEmployee();
		}
		else if(option==2) {
			employeeService.findDeveleoperEmployee(empList);
		}
		else if(option==3) {
			employeeService.findAllEmployeeSameCompany(empList);
		}
		else if(option==4) {
			employeeService.findAllEmployeeWithExperience(empList);
		}
		else {
			System.out.println("Wrong Input");
		}
	}
	}
}
