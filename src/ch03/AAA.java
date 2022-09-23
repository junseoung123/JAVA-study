package ch03;

public class AAA extends AA{
    int aaafield;
	
	public void aMethod() {
		System.out.println("AAA클래스의 매소드 푸분임");
		System.out.println(aaafield);
	}
	public AAA() {
		System.out.println("AAA 믈래스의 기본생성자 부분임");
		aaafield = 300;
	}
	public AAA(int aaafield) {
		System.out.println("A클래스의 명시적 생성자 부분임");
		this.aaafield = aaafield;
		
	}
	
	public AAA(int aaafield, int aafield) {
		System.out.println("A클래스의 명시적 생성자 부분임");
		this.aaafield = aaafield;
		super.aafield = aafield; //엄마클래스AA에 넣어준다
	}
	
	public AAA(int aaafield, int aafield, int afield) {
		System.out.println("A클래스의 명시적 생성자 부분임");
		this.aaafield = aaafield;
		super.aafield = aafield; //엄마클래스AA에 넣어준다
		super.afield =afield;
	}

}
