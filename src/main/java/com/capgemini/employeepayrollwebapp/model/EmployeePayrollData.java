package com.capgemini.employeepayrollwebapp.model;

import java.util.Date;

import com.capgemini.employeepayrollwebapp.dto.EmployeePayrollDTO;

public class EmployeePayrollData {

	private int employeeId;
	private String name;
	private String profilePic;
	private String gender;
	private String[] department;
	private double salary;
	private String note;
	private Date startDate;

	public EmployeePayrollData() {

	}

	public EmployeePayrollData(int employeeId, EmployeePayrollDTO employeePayrollDto) {
		super();
		this.employeeId = employeeId;
		this.name = employeePayrollDto.name;
		this.salary = employeePayrollDto.salary;
		this.profilePic = employeePayrollDto.profilePic;
		this.gender = employeePayrollDto.gender;
		this.department = employeePayrollDto.department;
		this.note = employeePayrollDto.note;
		this.startDate = employeePayrollDto.startDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getDepartment() {
		return department;
	}

	public void setDepartment(String[] department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}