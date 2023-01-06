package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s = "|" + " a happy ".trim() + "|";
		//.trim()을 이용하면 유저가 실수로 잘못 스페이스를 눌러도
		//무시하고 잘 처리할 수 있다.
		s = s.concat(" dog");
		//s를 주어, parameter을 목적어라고 하면 주어에 목적어를 붙이는 일을 한다.
		s = s.substring(2);
		//글자 앞부터 0인덱스로 본다. 지정한 인덱스 이하만 리턴한다는 의미이다.
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));
		//1인덱스만 리턴한다. 문자를 리턴할때 쓴다. char 
		
		int i = "apple".codePointAt(0);
		//해당 인덱스 글자인 p의 유니코드를 리턴한다.
		i = "a".hashCode();
		//해쉬코드가 곧 유니코드이다.
		i = "b".hashCode();
		i = "b".compareTo("a");
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a");
		i = s.indexOf("l");
		//l의 인덱스를 알고 싶다.
		//l이 두개인 경우 첫번째 l의 인덱스를 리턴한다.
		i = s.lastIndexOf("l");
		//마지막 인덱스를 알고 싶다.
		i = s.length();
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de");
		//b에게 booblean 타입을 우선적으로 부여함
		b = s.endsWith("lop");
		b = s.equals("develop");
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop");
		b = "".isEmpty();
		b = s.matches("[a-zA-Z]*");
		b = s.matches("[0-9]*");
		System.out.println(b);
	}
}

/* a의 유니코드= 97
A의 유니코드= 65
0의 유니코드 = 48 */

