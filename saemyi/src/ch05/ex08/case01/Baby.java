package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}
	
	public Baby(String babyName) {
		this.babyName = babyName;
		} //객체 생성직후에 맴버변수 값을 write하고 싶은 것이다.
	
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	} //객체가 생성 된 후에 맴버변수 값을 write하는 것이다.
}