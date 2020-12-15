package com.capgemini.employeepayrollwebapp.services;

import java.util.List;

import com.capgemini.employeepayrollwebapp.dto.EmployeePayrollDTO;
import com.capgemini.employeepayrollwebapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeeData();

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDto);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empDto);

	void deleteEmployeePayrollDataById(int empId);
}