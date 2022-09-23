package ch03;

public class AA extends A{
    int aafield;
	
	public void aMethod() {
		System.out.println("AA클래스의 매소드 푸분임");
		System.out.println(aafield);
	}
	
	public AA() {
		System.out.println("AA 믈래스의 기본생성자 부분임");
		aafield = 200;
	}
	
	public AA(int aafield) {
		System.out.println("A클래스의 명시적 생성자 부분임");
		this.aafield = aafield;
	}
	
	public AA(int aafield, int afield) {
		System.out.println("AA클래스의 명시적 생성자");
		this.aafield = aafield;
		//부모 멤버필드인 afield 값 넣기 super
		super.afield =afield;
	}

}
