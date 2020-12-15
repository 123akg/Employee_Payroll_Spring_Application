package com.capgemini.employeepayrollwebapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.employeepayrollwebapp.dto.EmployeePayrollDTO;
import com.capgemini.employeepayrollwebapp.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

	@Override
	public List<EmployeePayrollData> getEmployeeData() {
		List<EmployeePayrollData> empList = new ArrayList<>();
		EmployeePayrollData empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Abhijeet", 50168.40));
		empList.add(empData);
		return empList;
	}

	@Override
	public EmployeePayrollData getEmployeePayrollDataById(int empId) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, new EmployeePayrollDTO("Abhijeet", 50168.40));
		return empData;
	}

	@Override
	public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empDto) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, empDto);
		return empData;
	}

	@Override
	public EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empDto) {
		EmployeePayrollData empData = null;
		empData = new EmployeePayrollData(1, empDto);
		return empData;
	}

	@Override
	public void deleteEmployeePayrollDataById(int empId) {
		// TODO Auto-generated method stub
	}

}
