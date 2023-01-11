package com_my_hr.presentation;

import java.util.Objects;

import com_my_hr.domain.Employee;

public record EmployeeRecord(Employee employee) {
	public EmployeeRecord { 
		Objects.requireNonNull(employee);
	}
}