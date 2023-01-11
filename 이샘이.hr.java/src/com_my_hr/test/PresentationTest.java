package com_my_hr.test;

import com_my_hr.dao.EmployeeDao;
import com_my_hr.dao.EmployeeDaoImpl;
import com_my_hr.domain.Employee;
import com_my_hr.presentation.EmployeeIo;
import com_my_hr.service.EmployeeService;
import com_my_hr.service.EmployeeServiceImpl;

public class PresentationTest {
	public static void main(String[] args) {
		Employee employee = new Employee(null, null);
		EmployeeDao employeeDao = new EmployeeDaoImpl(employee);
		EmployeeService empService = new EmployeeServiceImpl(employeeDao);
		EmployeeIo employeeIo = new EmployeeIo(empService);
		
		employeeIo.play();
	}
}
