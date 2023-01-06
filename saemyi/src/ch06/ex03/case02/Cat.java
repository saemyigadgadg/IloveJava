package ch06.ex03.case02;

import ch05.ex06.case02.Console;

public class Cat extends Animal {
	@Override
	public void shout() {
		Console.info("야옹야옹.");
	}
}