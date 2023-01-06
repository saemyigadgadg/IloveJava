package ch06.ex05.case08;

public interface Animal {
	void move();
	
	default void eat() { }
}
