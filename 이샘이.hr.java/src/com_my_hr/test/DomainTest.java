package com_my_hr.test;

import java.time.LocalDate;

import com_my_hr.domain.Employee;

public class DomainTest {
	public static void main(String[] args) {
		Employee employee = new Employee("최한석 ", LocalDate.of(2022,2,4));
		System.out.println(employee);
		
		Employee employee2 = new Employee("한아름 ", LocalDate.of(2022,2,4));
		System.out.println(employee2);
		
		Employee employee3 = new Employee("양승일 ", LocalDate.of(2022,2,4));
		System.out.println(employee3);
	}
}
