package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love you.");
		//Man.tell(""); 인스턴스 메서드가 필요하다. 
		//주어에는 관심이 없다. 
		
		Man man = new Man();
		man.tell("I LOVE JAVA");
		man.say("Hello.");
		//남자가 말하고 있다.
	}
}
