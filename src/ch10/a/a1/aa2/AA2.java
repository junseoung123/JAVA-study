package ch10.a.a1.aa2;

public class AA2 {
	protected int pp;
	protected void pMethod() {
		System.out.println("protected 붙어있는 메소드");
	}
	protected AA2() {
		System.out.println("protected 붙어있는 기본생성자");
	}
	
	
	int pp1;
	void pMethod1() {
		System.out.println("default 붙어있는 메소드");
	}
	AA2(int a) {
		System.out.println("default 붙어있는 기본생성자");
	}
	
	
	int pp2;
	private void pMethod2() {
		System.out.println("private 붙어있는 메소드");
	}
	private AA2(int a, int b) {
		System.out.println("private 붙어있는 기본생성자");
	}
	
	
	int pp3;
	public void pMethod3() {
		System.out.println("public 붙어있는 메소드");
	}
	public AA2(int a, int b, int c) {
		System.out.println("public 붙어있는 기본생성자");
	}

}
