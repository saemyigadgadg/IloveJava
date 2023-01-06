package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); //( ) : parameter
		System.out.println(score);
		System.out.println(100 + 1);
		//수식 계산식을 표현한다. expression
		System.out.println(Math.random());
		/*매서드 네임에 parameter을 주는 것을 매서드 call이라고 한다.
		  리턴값이 있고 없고의 차이 0.0이상 1.0 미만의 값을
		  랜덤으로 리턴하게 된다.*/
		
		System.out.print(200);
		System.out.print(300); //값을 한줄로 표현
		System.out.print('\n'); //singlequote는 char데이터, doublequote는 string데이터이다.
		/*줄바꿈은 print의 기능으로 이루어진 것으로 \n이
		  줄바꿈 문자는 아니다. \n은 키보드 enter를 눌렀을 때
		  입력되는 문자를 표현한다.*/
		System.out.print(400);
		//가끔 줄바꿈을 사용할 때에는 위와 같이 하면 된다.
		System.out.println(); //자동으로 \n 기능을 추가한다.
		
		System.out.printf("%b %c %d %f %s\n",true,'a', 10, 1.15,"hello");
		/*seperator parameter을 n개 쓸 수 있게 된다.
		 * 첫번째 줄에는 늘 string 타입을 쓴다. 이는 양식을 정해주는 것이다.
		 * ~~~출력한 후에 줄바꿈까지 한다 하고 양식을 정한 것이다.
		 * 오른쪽에 양식에 맞는 데이터를 나열해 주면 된다.*/
		
		//과제 : 위 출력문에서 구분자로 /를 사용하라.*/
		
		System.out.printf("%b/%c/%d/%f/%s\n",true,'a', 10, 1.15,"hello");
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello");
		 //|로 구분자를 쓰고 데이터 타입 앞에 숫자를 지정해서 띄어쓰기를 할 수 있다. 
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s는 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다."); //snippet
		//수식에 참여하고 있는 연산을 당하는 값을 피연산자라고 한다.
		//피 연산자가 숫자면 더하기, 하나라도 문자이면 붙이기(concatenate)가 된다.
	}	
}
