package ch01;

public class ClassEx01 {
<<<<<<< HEAD
	
	public static void main(String[] arg) {
		//생성자를 사용하여서 "홍길동", "컴공", 100, 80 자료 입력해보기
		
		Sungjuk s1= new Sungjuk("홍길동", "컴공", 100, 80);
		//필드로 출력하기
		System.out.println(s1.name);
		System.out.println(s1.dept);
		//System.out.println(s1.kor); private 접근제한자라서
		//System.out.println(s1.mat); private 접근제한자라서
		
		//getter 출력
		System.out.println(s1.getName());
		System.out.println(s1.getDept());
		System.out.println(s1.getKor());
		System.out.println(s1.getMat());
		
		//기본생성자로 객체생성하세요
		Sungjuk s2 = new Sungjuk();
		System.out.println(s2.add(10, 20));
		System.out.println(s2.add(11.34, 22.55));
		System.out.println(s2.add("이름은", "홍길동", "입니다"));
	}

	
		

	}


=======

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
>>>>>>> refs/remotes/origin/master
