package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a";
		b = s == "a";
		
		s = new String("a");
		System.out.println(b);
		
		b = s == "a"; // 어째서 거짓인지 아직 이해할 수 없다.
		
		System.out.println(b);
		
		b = s.equals("a");
		/* 상수로 만들어졌는지 new라는 API로 만들었는지
		 * 모를 때에는 equals를 사용하면 된다.
		 * 논리적인 관점으로 비교한다.
		 */
		System.out.println(b);
	}
}
