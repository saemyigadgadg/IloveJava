package ch05.ex09.case01;

import ch05.ex06.case02.Console;

public class Init {
	private static int s;
	private int i;
	
	static {
		Init.s = 1;
		//this.i = 1; 문법상 실행되지 않는다. 
		Console.info("static{}");
	}//문법상의 기본값이 아닌 업무상 기본값으로 초기화 하고 싶을 때 사용한다.
	//실제로는 거의 안쓴다. 메모리 낭비가 크다.
	
	{
		this.i = 1;
		Init.s = 1;
		Console.info("{}");
	} //instance block
	
	{
		Console.info("{}2");
	}//instance는 이름이 없다 보니 서로 구분이 안된다. 
	//위쪽 {}에 넣으면 그만이다.
	
	public Init() {
		Console.info("Init{}");
	}//기본생성자를 추가해 줘야 컴파일 에러가안난다.(main의 9, 10)
	
	public Init(int i) {
		Console.info("Init(int)");
	}
}