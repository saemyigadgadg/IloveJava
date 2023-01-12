package com_my_hr.service;

import java.time.LocalDate;
import java.util.List;

import com_my_hr.dao.EmployeeDao;
import com_my_hr.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	
	@Override
	public Employee getEmployee() {
		return employeeDao.selectEmployees();
	}
	
	@Override
	public void addEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);
	}
	
	@Override
	public void fixEmployee(String employeeName, LocalDate regDate) {
		employeeDao.updateEmployee(employeeName, regDate);
	}
	
	@Override
	public void delEmployee() {
		employeeDao.deleteEmployee();
	}
}
