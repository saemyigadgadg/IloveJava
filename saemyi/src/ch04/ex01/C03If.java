package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int visitCnt = 0;
		
		if(visitCnt < 1) {
			System.out.println("첫 방문입니다.");
			visitCnt++;
		} else {
			System.out.println("재방문입니다.");
		}
		
		if(visitCnt < 1) System.out.println("첫방문입니다.");
		else System.out.println("재방문입니다.");
		//위의 {}에서 방문 카운트가 1 올랐다.
	}
}
