package ch02;

public class Marine extends Unit{
	void stimpack() {
		System.out.println("�������� ����Ѵ�");
	}
	
	//�ڽ��� �ָ��� �޼ҵ�� ������ ��������� ������ �ٸ��� �ۼ��Ҽ��ִ�
	void move(int x, int y) {
		System.out.println("������ ��ġ :" + (x+10) + "," + (y-10));
		
	}

}
