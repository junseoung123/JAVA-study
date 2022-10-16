package ch06;

public interface RemoteControl {
	//상수선언 static final생략
	public int MAXVOLUME=10;
	public int MIN_VOLUME=0;
	
	//추상메소드 abstract 생략
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//default메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
		} else {
			System.out.println("무음해제합니다");
		}
	}
	
	//new를 안써줘도됌
	static void changerBattery() {
		System.out.println("건전지를 교체합니다");
	}

}
