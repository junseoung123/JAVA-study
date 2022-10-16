package ch06;

public class InterfaceEx05 {

	public static void main(String[] args) {
		// 구현객체를 객체생성하기
		
		Television tv = new Television();
		Audio audio = new Audio();
		tv.turnOn();
		tv.setVolume(8);
		tv.setMute(true);
		tv.turnOff();
		
		//다형성 Animal animal = new Cat();
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		
		rc1.turnOn();
		rc1.setVolume(8);
		rc1.setMute(true);
		rc1.turnOff();
		
		if(rc2 instanceof Audio) {
			rc2.turnOn();
			rc2.setVolume(8);
			rc2.setMute(true);
			rc2.turnOff();
		} else {
			System.out.println("Audio 클래스 출력 안됩니다");
		}
		

	}

}
