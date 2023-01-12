package com_my_hr.presentation;

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
    int choice = 0;
    String jobName = "";
    boolean end = false;
    boolean isGood = false;
    List<Employee> list = new ArrayList<>();
    
    do {
       do {
	          int num = Console.inNum("0.종료 1.목록 2.추가 3.수정 4.삭제\n");
	          if(num > 4) {isGood = false; Console.err("목록중에 고르세요.");}
	          else {
	             choice = num;
		             switch(Job.valueOf(choice)) {
		             case EXIT -> jobName = "종료";
		             
		             case LIST -> {
		            	 		if(list.size() == 0) {Console.info("노동자가 없습니다.");}
		             			else {{Console.info("| 노동자ID | 노동자명 |   입사일   |\n"); 
		             			for(Employee employees : list) Console.info(employees);}}}
		             
		             case ADD -> {
			            	 	String inputName = Console.inStr("노동자명: ");
			            	 	if(inputName.matches("0")) { jobName = "다시"; }
			            	 	else{ employeeService.addEmployee
			             		(new Employee(inputName , Console.inDate("입사일: "))); 
			            	 	list.add(employeeService.getEmployee()); 
			            	 	Console.info("노동자가 추가 되었습니다.");}}
		             
		             case FIX -> {
			            	 	if(list.size() == 0) {Console.info("노동자가 없습니다.");}
			            	 	
			            	 	else {int input = Console.inNum("목록에서 수정할 행을 고르세요.");
			            	 	if(input == 0) { jobName = "다시"; }
			            	 	else{  list.get(input - 1) ; employeeService.fixEmployee
						             		(Console.inStr("노동자명: ") , Console.inDate("입사일: "));}
				            	 	
			            	 	Console.info(input + "행의 노동자가 수정 되었습니다.");}
			            	 	}
			             
		             case DEL -> {
				            	 if(list.size() == 0) {Console.info("노동자가 없습니다.");}
				            	 else {int input = Console.inNum("목록에서 삭제할 행을 고르세요.");
				            	 if(input == 0) { jobName = "다시"; }; 
				            	 list.remove(input - 1); Console.info(input + "행의 노동자가 삭제 되었습니다.");}}
			             default -> jobName = "종료";
		             }
	             Console.info("---------------------------------------------");
	             end = jobName.matches("종료");}
          }while(!end);
       } while(isGood);
 	}
}