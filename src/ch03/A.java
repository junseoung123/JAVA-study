package ch03;

public class A {
	int afield;
	
	public void aMethod() {
		System.out.println("AŬ������ �żҵ� Ǫ����");
		System.out.println(afield);
	}
	
	public A() {
		System.out.println("AŬ������ �⺻������ �κ���");
		afield = 100;
	}
	
	public A(int afield) {
		System.out.println("AŬ������ ����� ������ �κ���");
		this.afield = afield;
	}
	
	public A(int afield, int b, int c, int d) {
		System.out.println("AŬ������ ����� ������ �κ���");
		this.afield = afield;
	}

}
