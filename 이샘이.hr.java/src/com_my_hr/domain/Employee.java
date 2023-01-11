package com_my_hr.domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee extends ArrayList<Employee> {
	private String employeeName;
	private static int cnt = 0;
	private int employeeId;
	private LocalDate regDate;
	
	
	public Employee(String employeeName, LocalDate regDate) {
		cnt++;
		this.employeeId = cnt;
		this.employeeName = employeeName;
		this.regDate = regDate;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	@Override
	public String toString() {
		return String.format("%5d %5s %5s\n",
				employeeId, employeeName, regDate);
	}
}
