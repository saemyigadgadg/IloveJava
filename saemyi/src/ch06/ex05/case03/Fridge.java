package ch06.ex05.case03;

import ch06.ex05.case01.Appliance;

public class Fridge extends Appliance {
	@Override
	public void off() {}
}
//on은 일반 메소드로 그대로 상속받고
//off는 추상 메소드로 오버라이드가 필요하다.