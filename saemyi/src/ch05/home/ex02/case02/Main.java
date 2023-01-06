package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Paper paper = new Paper();
		String msg = "";
		String writenName = "";
		
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;
		
		do {
			System.out.print("메세지: ");
			msg = sc.nextLine();
			isGood = msg.matches("[a-zA-Z가-힣\s0-9]+");
			if(isGood) paper.setMsg(msg);
			else System.out.println("ERROR] 메세지를 입력하세요.");
		} while(!isGood);
		
		do {
			System.out.print("작성자명: ");
			writenName = sc.nextLine();
			isGood = writenName.matches("[a-zA-Z가-힣]+");
			if(isGood) paper.setWriterName(writenName);
			else System.out.println("ERROR] 작성자명을 입력하세요.");
		} while(!isGood);
		
		System.out.printf("\n%s from %s", paper.getMsg(), paper.getWriterName());
	}
}
