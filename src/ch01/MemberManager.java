package ch01;

public class MemberManager {

	        // 클래스만들기
			// 클래스 구성요소 : 변수(필드), 매소드, 생성자 new ClassEx01(), 클래스
			// 회원관리프로그램 회원번호 회원명 전화번호 프로그램명 메니저명
	
	String memberNumber; //회원번호
	String memberName; //회원명
	String memberPhone; //전화번호
	String programName; //프로그램명
	String managerName; //매니저명
	int membershipFee; //가격
	
	//생성자를 잃으면 기본생성자를 컴파일러 자동으로 만들어준다.
	public void MemberManager( ) {
		//생성자
	}
	
	//자바는 인수가 다르게 여러개의 생성자를 만들 수있다-생성자 오버로딩
	public MemberManager(String memberNumber, String memberName, String memberPhone, String programName, String managerName, int membershipFee) {
		this.memberNumber = memberNumber;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
	    this.programName = programName;
	    this.managerName = managerName;
	    this.membershipFee = membershipFee;
	    }
	
	public MemberManager(String memberNumber, String memberName, int membershipFee) {
		this.memberNumber = memberNumber;
		this.memberName = memberName;
		this.membershipFee = membershipFee;
	}


	}


