package ch02.ex01;

public class C04Assign {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		a = b;
		System.out.printf("%d, %d\n", a, b);
		
		a = b + 1;
		System.out.printf("%d, %d\n", a, b);
		
		double d = Math.random();
		System.out.printf("%.2f", d);//소수점 2자리까지의 숫자를 랜덤으로 리턴한다.
	}
}
