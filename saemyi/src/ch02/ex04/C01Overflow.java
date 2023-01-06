package ch02.ex04;

public class C01Overflow {
	public static void main(String[] args) {
		byte b = 10;
		int i = b; //byte를 int로 형변환 소실되는 데이터가 없다.
		i = (int)b;
		System.out.println(i);
		
		int i2 = 300;
		byte b2 = (byte)i2;
		System.out.println(b2);
		/*byte의 범위를 넘어선 int값은 byte로 전환하면서 
		  overflow가 발생한다. 이에 따라 300이 결과값으로 나와야 하지만
		  44라는 뜬금없는 숫자가 나오게 되었다.*/
	}
}
