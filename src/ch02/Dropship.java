package ch02;

public class Dropship extends Unit{
	void load(int x, int y) {
		System.out.println("���ۼ� ������ġ (" + x + "," + y);
	}
	void upload(int x, int y) {
		System.out.println("���ۼ� ��ũ��ġ (" + x + "," + y);
	}
	
	void move(int x, int y) {
		System.out.println("���ۼ��� ��ġ" + (x-100) + "," + (y-500));
		
	}

}
