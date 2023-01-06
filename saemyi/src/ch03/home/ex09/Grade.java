package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int tot = 0;
		double avg = 0;
		char grade = 0;
		
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		tot = kor + eng + math;
		avg = tot / 3.0;
		grade = (avg >= 90) ? 'A' : (avg >= 80) ? 'B' : 'C';
		
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c", tot, avg, grade);
		
	}
}
