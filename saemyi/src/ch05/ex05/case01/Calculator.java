package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b+ c;
	}
}

/*
 * 메소드 네임이 중복되면 안된다.
 * 4번 줄의 메소드 네임은 add(int int)이며
 * 8번줄의 메소드 네임은 add(int int int)로 중복이 아니다.
 */