package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; overflow로 오류가 발생한다.
		byte b = 127; //01111111 = 127으로 byte가 표현할 수 있는 최대값이다.
		//b = b + 1; overflow되어 오류가 발생한다.
		
		b++; 
		/* b에서 값을 read한 후 더하기 1을 했다. 
		 * 이 결과값을 다시 write한 것이다.
		 * => 결국 결과값은 -128이 되었다. 01111111에 1을 더하니
		 * 결국 10000000이 되었다 이는 -128을 의미한다.
		 */
		b++;//-128 + 1 = -127
		System.out.println(b);
	}
}
