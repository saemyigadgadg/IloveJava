package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
		//int i = 0; 중복 선언이 안된다.
		int j = 0;
		{
			int x = 0;
			int y = 0;
		}
		int x = 0;
		/*프로그램은 위에서 아래로 시작되며 Scope안에 있는 변수들은
		Scope가 끝나면서 죽은 상태가 된다. 따라서 바깥Scope의
		int x는 중복된 상태가 아니다.*/
	}
}
//javaw.exe(virtual machine이 태어나고) C05Scope(loading 하고) 매서드를 call한다.