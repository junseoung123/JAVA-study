package ch05;

public class Process01 {
	
	static int a;
	static {
		System.out.println("�̰��� ���� ��� �ΰ�");
		a = 10;
		
	}
	{
		System.out.println("�̰��� �ν��Ͻ� ��� �ΰ�");
		a = 20;
		
	}
	
	public Process01() {
		System.out.println("�̰��� �⺻������ �Դϴ�");
		a = 30;
	}
	public static void sMethod() {
		System.out.println("�̰��� ���� �ΰ�");
		a = 40;
	}
    public void iMethod() {
	    System.out.println("�̰��� �ν��Ͻ� ��� �ΰ�");
	    a = 50;
}
	

}
