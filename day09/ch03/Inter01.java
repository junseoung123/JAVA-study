package ch03;

//�������̽��� �߻�޼ҵ常 �������ִ� ��ü
public interface Inter01 {
	//�������մ��ڷ� 
	
	//1. ����ʵ�
	static final double PI = 3.14; 
	static final int AREA = 300;
	static final String schoolName = "��Ƽķ�۽�";
	
	//2.�߻�޼ҵ� - ������ ���������� ���ؼ� �̿ϼ��� �޼ҵ� �κ���
	abstract void abmethod();
	abstract int abMethod2();
	
	//3. default �޼ҵ�
	default void defaultMethod() {
		System.out.println("�̰��� default �޼ҵ� �κ���");
		System.out.println("���α׷� ���� �����Ҷ� �ʿ�");
	}
	
	//4.�����޼ҵ�
	static void stMethod() {
		//���� �޼ҵ� ����
		System.out.println("�����޼ҵ�");
	}
}
