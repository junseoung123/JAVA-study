package ch01;

public class ClassEx01 {

	public static void main(String[] args) {
		// 클래스만들기
		// 클래스 구성요소 : 변수(필드), 매소드, 생성자 new ClassEx01(), 클래스
		// 회원관리프로그램 회원번호 회원명 전화번호 프로그램명 메니저명
		
		//직접출력
		MemberManager mm = new MemberManager( "1001", "홍길동", "123-1234", "기본헬스", "정현희", 10000);
		System.out.println(mm.managerName + mm.memberNumber);
		
		MemberManager mm2 = new MemberManager("1002", "홍길동", 50000);
		System.out.println(mm2.memberNumber);
		
		MarkClassEx mk = new MarkClassEx("이메일", 10000);
		System.out.println(mk.markFee);
		
		//객체화하기
		AdminManager adminManager= new AdminManager("홍길동", "멀티캠퍼스");
		
		AdminManager adminManager2= new AdminManager(2000, false);

	}

}
