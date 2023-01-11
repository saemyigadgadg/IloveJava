package com_my_hr.dao;

import java.time.LocalDate;

import com_my_hr.domain.Employee;

public interface EmployeeDao {
	public Employee selectEmployees();//read
	public void insertEmployee(Employee employee);//추가
	public void updateEmployee(String employeeName, LocalDate regDate);//수정
	public void deleteEmployee();//삭제
}