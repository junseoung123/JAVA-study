package ch02;

public class Marine extends Unit{
	void stimpack() {
		System.out.println("스팀팩을 사용한다");
	}
	
	//자식의 붑모의 메소드와 동일한 모습이지만 내용을 다르게 작성할수있다
	void move(int x, int y) {
		System.out.println("보병의 위치 :" + (x+10) + "," + (y-10));
		
	}

}
