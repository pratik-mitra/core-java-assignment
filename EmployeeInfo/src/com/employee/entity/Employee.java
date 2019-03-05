package com.employee.entity;

public class Employee {
	
	private String empName = null;
	private Integer age = 0;
	private String designation = null;
	private EducationDetails educationDetails;
	private EmploymentHistory employmentHistory;
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public EducationDetails getEducationDetails() {
		return educationDetails;
	}
	public void setEducationDetails(EducationDetails educationDetails) {
		this.educationDetails = educationDetails;
	}
	public EmploymentHistory getEmploymentHistory() {
		return employmentHistory;
	}
	public void setEmploymentHistory(EmploymentHistory employmentHistory) {
		this.employmentHistory = employmentHistory;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", age=" + age + ", designation=" + designation + ", educationDetails="
				+ educationDetails + ", employmentHistory=" + employmentHistory + "]";
	}
}
