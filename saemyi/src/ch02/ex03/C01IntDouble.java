package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i; //자동 변환(promotion)이 가능하다.
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i;
		System.out.printf("%f, %d\n", d, i);
		
		//i = d; 자동변환이 일어나지 않는다.
		
		i = (int)d;
		System.out.printf("%f, %d\n", d, i);
		/* d 변수에서 read한 값을 i가 write한 것이 아닌 casting
		 * 연산자가 return한 값이다.
		 */
	}
}
