package ch05.home.ex05.case06;

public class Person {
	private String personName;
	private Phone phone;
	
	public void message() {
		phone.message();
	}
	
	public void call() {
		phone.call();
	}
	
	public void game() {
		phone.game();
	}
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
}
