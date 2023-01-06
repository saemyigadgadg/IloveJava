package ch03.ex07;

public class C01Compare {
	public static void main(String[] args) {
		boolean b = 'A' < 'B';
		b = '0' == 0;
		b = 'A' != 65;
		b = 10.0 == 10.0f;
		b = 0.1 == 0.1f;   //double > float는 자동형변환 안되므로 false
		b = (float)0.1 == 0.1f;
		
		System.out.println(b);
	}
}
