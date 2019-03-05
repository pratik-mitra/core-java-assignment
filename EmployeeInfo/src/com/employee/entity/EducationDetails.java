package com.employee.entity;

import java.time.LocalDate;

public class EducationDetails {
	
	private String degreeName = null;
	private double avgMarks = 0;
	private LocalDate date = LocalDate.now();
	
	public EducationDetails() {}
	
	public EducationDetails(String degreeName, double avgMarks, LocalDate date) {
		super();
		this.degreeName = degreeName;
		this.avgMarks = avgMarks;
		this.date = date;
	}
	public String getDegreeName() {
		return degreeName;
	}
	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}
	public double getAvgMarks() {
		return avgMarks;
	}
	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "EducationDetails [degreeName=" + degreeName + ", avgMarks=" + avgMarks + ", date=" + date + "]";
	}
}
