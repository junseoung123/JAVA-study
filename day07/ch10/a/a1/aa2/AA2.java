package ch10.a.a1.aa2;

public class AA2 {
	protected int pp;
	protected void pMethod() {
		System.out.println("protected �پ��ִ� �޼ҵ�");
	}
	protected AA2() {
		System.out.println("protected �پ��ִ� �⺻������");
	}
	
	
	int pp1;
	void pMethod1() {
		System.out.println("default �پ��ִ� �޼ҵ�");
	}
	AA2(int a) {
		System.out.println("default �پ��ִ� �⺻������");
	}
	
	
	int pp2;
	private void pMethod2() {
		System.out.println("private �پ��ִ� �޼ҵ�");
	}
	private AA2(int a, int b) {
		System.out.println("private �پ��ִ� �⺻������");
	}
	
	
	int pp3;
	public void pMethod3() {
		System.out.println("public �پ��ִ� �޼ҵ�");
	}
	public AA2(int a, int b, int c) {
		System.out.println("public �پ��ִ� �⺻������");
	}

}
