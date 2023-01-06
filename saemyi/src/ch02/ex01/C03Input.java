package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*입력작업을 하고 싶을 때 쓰는 기능이다.
		  Scanner = class 이며 sc = 변수이다.
		  에러 메세지는 compiler가 만드는데 이때 ctlr+shift+O로 해결한다.*/
		
		/*System.out.print("문자열을 입력하세요.\n> ");
		sc.nextLine();
		System.out.println("입력했습니다.");
		*/
		
		/*String str = sc.nextLine();
		//soft coding 이라고 부르는 확장성을 만드는 수단이다.
		System.out.printf("%s를 입력했습니다.", str);
		*/
		
		/*System.out.print("숫자를 입력하세요.\n");
		int i = sc.nextInt();
		System.out.println(i + "을 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n");
		i = sc.nextInt(); sc.nextLine();
		System.out.println(i + "을 입력했습니다.");
		*/
		
		//과제 : 오류를 해결하라.
		
		System.out.print("문자를 입력하세요.\n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c + "를 입력했습니다.");
		//0인덱스의 글자를 리턴한다.
		
		
		
	}
}
