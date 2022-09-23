package ch04;

public class StaticEx01 {

	public static void main(String[] args) {
		// 정적멤버사용법
		StaticEx.sname = "정적멤버변수";
		StaticEx.sage = 20;
		StaticEx.smethod();
		
		//인스턴스 변수 사용법
		//1단계 객체화한다
		//2단계 참조변수 연결하여 사용
		
		StaticEx se1 = new StaticEx();
		se1.iname = "인스턴스 변수값";
		se1.iage = 10;
		
		se1.imethod();

	}

}
