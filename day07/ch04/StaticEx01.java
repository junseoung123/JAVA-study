package ch04;

public class StaticEx01 {

	public static void main(String[] args) {
		// �����������
		StaticEx.sname = "�����������";
		StaticEx.sage = 20;
		StaticEx.smethod();
		
		//�ν��Ͻ� ���� ����
		//1�ܰ� ��üȭ�Ѵ�
		//2�ܰ� �������� �����Ͽ� ���
		
		StaticEx se1 = new StaticEx();
		se1.iname = "�ν��Ͻ� ������";
		se1.iage = 10;
		
		se1.imethod();

	}

}
