package ch01;

public class MarkClassEx {
	//������ ���� Ŭ����
	String markKind; //������ ���� �̸��� sns ������ ��Ÿ
	int markFee;//������ ���
	
	//�̸��� 100����
	//�� �ڷḦ ���� ������ �����
	

	public MarkClassEx(String markKind, int markFee) {
		this();//������ �ȿ� ����� ù°�ٿ� �����
		this.markKind = markKind;
		this.markFee = markFee;
	}
	public MarkClassEx() {
		//this("�̸���", 100, "SNS", 50, "������", 200);
		//this("SNS", 50); �����ڳ��� ���� ȣ���ϸ� �ȵ�
		
		System.out.println("<<��Ƽķ�۽� ���� ��� ���� >>");
		
	}
	public MarkClassEx(String a, int b, boolean c) {
		System.out.println("<<��Ƽķ�۽� ���� ��� ���� >>");
	}
	
	int number; //1000
	boolean yn; //false
	String name; //ȫ�浿
	String school; //��Ƽķ�۽�

}
