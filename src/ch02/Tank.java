package ch02;

public class Tank extends Unit{
	void changeMode() {
		System.out.println("��ũ ���ݸ�带 ��ȯ�Ѵ�");
	}
	
	void move(int x, int y) {
		System.out.println("��ũ�� ��ġ" + (x-50) + "," + (y+50));
		
	}

}
