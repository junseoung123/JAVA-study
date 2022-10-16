package ch03;

//인터페이스는 추상메소드만 가질수있는 객체
public interface Inter01 {
	//넣을수잇는자료 
	
	//1. 상수필드
	static final double PI = 3.14; 
	static final int AREA = 300;
	static final String schoolName = "멀티캠퍼스";
	
	//2.추상메소드 - 무엇을 실핼할지에 대해서 미완성된 메소드 부분임
	abstract void abmethod();
	abstract int abMethod2();
	
	//3. default 메소드
	default void defaultMethod() {
		System.out.println("이곳은 default 메소드 부분임");
		System.out.println("프로그램 유지 보수할때 필요");
	}
	
	//4.정적메소드
	static void stMethod() {
		//정적 메소드 선언
		System.out.println("정적메소드");
	}
}
