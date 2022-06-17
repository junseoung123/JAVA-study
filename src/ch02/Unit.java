package ch02;

public class Unit {
	int x, y; //현재위치
	void move(int x, int y) {
		System.out.println("Unit 클래스의 move 메소드 부분임" + x + "," + y);
		
	}
	void stop() {
		System.out.println("현재위치에서 멈춥니다"); 
	}

}
