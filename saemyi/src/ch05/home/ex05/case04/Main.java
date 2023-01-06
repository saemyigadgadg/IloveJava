package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		
		man.setManName("최한석");
		man.setAge(33);
		man.setBirthday(LocalDate.of(2022, 6, 7));
		
		man.sing();
		man.eat();
		man.run();
	}
}