package ch02;

public class Tank extends Unit{
	void changeMode() {
		System.out.println("탱크 공격모드를 변환한다");
	}
	
	void move(int x, int y) {
		System.out.println("탱크의 위치" + (x-50) + "," + (y+50));
		
	}

}
