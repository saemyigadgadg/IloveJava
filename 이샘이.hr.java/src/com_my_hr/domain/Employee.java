package com_my_hr.domain;

import java.time.LocalDate;

public class Employee {
	private String employeeName;
	private static int cnt = 0;
	private int employeeId;
	private LocalDate regDate;
	
	
	public Employee(String employeeName, LocalDate regDate) {
		cnt++;
		this.employeeId = cnt - 1;
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
		return String.format("%6d %10s    %10s",
				employeeId, employeeName, regDate);
	}
}
