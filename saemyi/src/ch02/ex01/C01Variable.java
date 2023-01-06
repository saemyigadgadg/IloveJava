package ch02.ex01;

public class C01Variable {
	public static void main(String[] args) {
		boolean bl = false;   //boolean은 유일해야 한다.
		bl = true;
		
		byte b = 0; //statement(명령문)
		short s = 0;
		char c = 0;
		int i = 0;             //8-12번은 logical하게 전부 0이지만 크기는 다르다.
		long l = 0;
		float f = 0.0f;    //f라는 데이터 타입을 지정해주어 에러를 제거한다.
		double d = 0.0;
		
		String str = "hello";
		/*char type의 데이터 5개를 핝자리에 모아서(배열) 처리한다.
		 * 로그인, 패스워드 등은 대부분 string을 쓴다.
		 * 
		 * char은 문자 하나만 쓰는데 현장에서는 거의 쓸 일이 없으므로
		 * string을 쓴다.
		 */
		
		int a;
		a = 0; // initialization : 초기화
		
		int x;
		int y;
		//int x, y; 이렇게 쓸 수 있지만 나쁜 코드이다.
		//int x2 = 0, y2 = 0; 이 또한 나쁜 코드라고 볼 수 있다.
	}
}
