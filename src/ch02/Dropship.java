package ch02;

public class Dropship extends Unit{
	void load(int x, int y) {
		System.out.println("수송선 보병위치 (" + x + "," + y);
	}
	void upload(int x, int y) {
		System.out.println("수송선 탱크위치 (" + x + "," + y);
	}
	
	void move(int x, int y) {
		System.out.println("수송선의 위치" + (x-100) + "," + (y-500));
		
	}

}
