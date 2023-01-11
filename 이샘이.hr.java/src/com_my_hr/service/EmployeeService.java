package com_my_hr.service;

import java.time.LocalDate;

import com_my_hr.domain.Employee;

public interface EmployeeService {
	public Employee getEmployee();//read
	public void addEmployee(Employee employee);
	public void fixEmployee(String employeeName, LocalDate regDate);
	public void delEmployee();
}