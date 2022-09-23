package ch04;

public class StaticEx {
	//정적 멤버 또는 클래스 멤버
	static String sname;
	static int sage;
	
	//인스턴스 멤버
	String iname;
	int iage;
	
	//정적 메소드
	public static void smethod() {
		System.out.println("이곳은 정적 메소드");
		System.out.println(sname);
		System.out.println(sage);
		
	}
	
	
	//인스턴스 메소드
	public void imethod() {
		System.out.println("이곳은 인스턴스");
		System.out.println(iname);
		System.out.println(iage);
		System.out.println(StaticEx.sname);
		System.out.println(StaticEx.sage);
		
	}
	
	//메소드 만들기 정적필드, 인스턴스필드 다 출력
	//1. 정적메소드 2.인스턴스메소드 정답 2

}
