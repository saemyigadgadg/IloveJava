package ch06.p_227;

public class Calculator {
	int plus(int x, int y) { 
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) { //3 plus메소드를 호출한다.
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void excute() {
		double result = avg(7, 10); //2 avg 메소드를 호출한다.
		println("실행결과: " + result);//4 println 메소드를 호출한다.
	}
	
	void println(String message) {
		System.out.println(message);
	}
}