package ch01;

public class MarkClassEx {
	//마케팅 관련 클래스
	String markKind; //마케팅 종류 이메일 sns 전단지 기타
	int markFee;//마케팅 비용
	
	//이메일 100만원
	//위 자료를 받을 생성자 만들기
	

	public MarkClassEx(String markKind, int markFee) {
		this();//생성자 안에 써야함 첫째줄에 써야함
		this.markKind = markKind;
		this.markFee = markFee;
	}
	public MarkClassEx() {
		//this("이메일", 100, "SNS", 50, "전단지", 200);
		//this("SNS", 50); 생성자끼리 서로 호출하면 안됨
		
		System.out.println("<<멀티캠퍼스 광고 비용 내역 >>");
		
	}
	public MarkClassEx(String a, int b, boolean c) {
		System.out.println("<<멀티캠퍼스 광고 비용 내역 >>");
	}
	
	int number; //1000
	boolean yn; //false
	String name; //홍길동
	String school; //멀티캠퍼스

}
