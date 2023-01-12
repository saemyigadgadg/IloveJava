package com_my_hr.presentation;

import java.time.LocalDate;
import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	private static void inMsg(String msg) {
		System.out.print(msg);
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		boolean isGood2 = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣0]+");
			isGood2 = (input.length() <= 5);
			if(!isGood) Console.err("문자가 아닙니다.");
			if(!isGood2) Console.err("5글자 이내로 입력하세요.");
		} while(!isGood || !isGood2);
		
		return input;
	}
	
	public static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[0-9]+");
			if(!isGood) Console.err("0 이상의 정수가 아닙니다.");
		}while(!isGood);
		
		return Integer.parseInt(input);
	}
	
	public static LocalDate inDate(String msg) {
		String inputYear = "";
		String inputMonth = "";
		String inputDay = "";
		int year = 0;
		int month = 0;
		int day = 0;
		boolean isGood = false;
		
		do {
			Console.inMsg(msg + "\n");
			do {
				Console.inMsg("년도: ");
				inputYear = sc.nextLine();
				isGood = inputYear.matches("[0-9]+");
				if(isGood) year = Integer.parseInt(inputYear);
				isGood = (1000 < year && year < 10000);
				if(!isGood) Console.err("다시 입력하세요.");
			}while(!isGood);
			do {
				Console.inMsg("월: ");
				inputMonth = sc.nextLine();
				isGood = inputMonth.matches("[0-9]+");
				if(isGood) month = Integer.parseInt(inputMonth);
				isGood = (0 < month && month <= 12);
				if(!isGood) Console.err("다시 입력하세요.");
			}while(!isGood);
			do {
				Console.inMsg("일: ");
				inputDay = sc.nextLine();
				isGood = inputDay.matches("[0-9]+");
				if(isGood) day = Integer.parseInt(inputDay);
				isGood = (0 < day && day <= 31);
				if(!isGood) Console.err("다시 입력하세요.");
			}while(!isGood);
		}while(!isGood);
		
		return LocalDate.of(year,month,day);
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
