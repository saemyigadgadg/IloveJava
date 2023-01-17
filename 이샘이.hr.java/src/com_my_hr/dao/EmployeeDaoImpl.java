package com_my_hr.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com_my_hr.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private Employee employee;
	
	public EmployeeDaoImpl(Employee employees) {
		
	}

	public Employee selectEmployees() {
		return this.employee;
	}
	
	@Override
	public void insertEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@Override
	public void updateEmployee(String employeeName, LocalDate regDate) {
		this.employee.setEmployeeName(employeeName);
		this.employee.setRegDate(regDate);
	}
	
	@Override
	public void deleteEmployee() {
		this.employee = null;
	}
}
