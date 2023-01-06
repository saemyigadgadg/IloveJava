package ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
		//this.citrusName = "레드향";
		this("레드향");
	}//기본생성자는 하나라도 쓰면 자동으로 써지지 않으므로 수작업으로 적어 주어야 한다.
	
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}
}