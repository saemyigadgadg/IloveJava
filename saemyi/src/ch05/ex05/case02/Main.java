package ch05.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double result = calculator.add(1, 2);
		result = calculator.add(1.0, 2.0);
		
		System.out.println(result);
	}
}
//오버로딩을 쓰면 메서드의 transparancy(투명성)이 확보된다.