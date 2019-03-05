package com.employee.entity;

public class EmploymentHistory {
	
	/*private String empId = null;*/
	private String nameOfOrganization = null;
	private double duration = 0;
	private String projectName = null;
	
	public EmploymentHistory() {}
	
	public EmploymentHistory(String nameOfOrganization, double duration, String projectName) {
		super();
		this.nameOfOrganization = nameOfOrganization;
		this.duration = duration;
		this.projectName = projectName;
	}
	
	/*public EmploymentHistory(String empId, String nameOfOrganization, double duration, String projectName) {
		super();
		this.empId = empId;
		this.nameOfOrganization = nameOfOrganization;
		this.duration = duration;
		this.projectName = projectName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}*/

	public String getNameOfOrganization() {
		return nameOfOrganization;
	}
	public void setNameOfOrganization(String nameOfOrganization) {
		this.nameOfOrganization = nameOfOrganization;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "EmploymentHistory [nameOfOrganization=" + nameOfOrganization + ", duration=" + duration + ", projectName=" + projectName + "]";
	}
}
