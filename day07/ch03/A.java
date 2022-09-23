package ch03;

public class A {
	int afield;
	
	public void aMethod() {
		System.out.println("A클래스의 매소드 푸분임");
		System.out.println(afield);
	}
	
	public A() {
		System.out.println("A클래스의 기본생성자 부분임");
		afield = 100;
	}
	
	public A(int afield) {
		System.out.println("A클래스의 명시적 생성자 부분임");
		this.afield = afield;
	}
	
	public A(int afield, int b, int c, int d) {
		System.out.println("A클래스의 명시적 생성자 부분임");
		this.afield = afield;
	}

}
