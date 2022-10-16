package ch07;

//비즈니스로직 클래스
//메인 메소드와 연결하여 각 클래스의 동작등을 제어하기, 조립하는부분
public class Car {
	// 각 구현 클래스 생성
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}

}
