package ch04;

public class StaticEx {
	//���� ��� �Ǵ� Ŭ���� ���
	static String sname;
	static int sage;
	
	//�ν��Ͻ� ���
	String iname;
	int iage;
	
	//���� �޼ҵ�
	public static void smethod() {
		System.out.println("�̰��� ���� �޼ҵ�");
		System.out.println(sname);
		System.out.println(sage);
		
	}
	
	
	//�ν��Ͻ� �޼ҵ�
	public void imethod() {
		System.out.println("�̰��� �ν��Ͻ�");
		System.out.println(iname);
		System.out.println(iage);
		System.out.println(StaticEx.sname);
		System.out.println(StaticEx.sage);
		
	}
	
	//�޼ҵ� ����� �����ʵ�, �ν��Ͻ��ʵ� �� ���
	//1. �����޼ҵ� 2.�ν��Ͻ��޼ҵ� ���� 2

}
