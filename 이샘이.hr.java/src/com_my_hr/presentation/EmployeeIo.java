package com_my_hr.presentation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com_my_hr.domain.Employee;
import com_my_hr.service.EmployeeService;

public class EmployeeIo {
	private EmployeeService employeeService; 
	
	public EmployeeIo(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	public void play() {
		boolean end = false;
		List<Employee> list = new ArrayList<>();
		
		do {
			String jobName = "";
			int choice = Console.inNum("[메뉴] 0.종료 1.목록 2.추가 3.수정 4.삭제\n");
			for(Employee emp : list)
			switch(Job.valueOf(choice)) {
			case EXIT -> jobName = "종료";
			case LIST -> System.out.println(emp);
			case ADD -> employeeService.addEmployee(new Employee(Console.inStr("이름을 입력하세요."),
					LocalDate.of(Console.inNum("입사년"),Console.inNum("입사월"),Console.inNum("입사일"))));
			case FIX -> jobName = "수정";
			case DEL -> jobName = "삭제";
			default -> jobName = "종료";
			}
			if(choice == 2) list.add(employeeService.getEmployee());
			System.out.println("---------------------------------------------");
			end = jobName.matches("종료");
			}while(!end);
	}
}