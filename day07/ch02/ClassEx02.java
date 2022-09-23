package ch02;

public class ClassEx02 {

	public static void main(String[] args) {
<<<<<<< HEAD
		Office ow = new Office();
		ow.setName("홍길동");
		ow.setAge(30);
		ow.setSabun("1000");
		
		//전부다 출력하기
		ow.allPrint();
		
		//1단계 Student 클래스 객체생성
		Student st = new Student();
		//setter로 값을 넣기
		st.setName("정현희");
		st.setAge(25);
		st.setHakbun("2020");
		st.allPrint();
		

=======
		
		HealthClass hc = new HealthClass();
		
		//메소드를 통해서 값을 멤버변수에 넣기
		
		hc.setNumber("1000");
		hc.setProgram("기본헬스");
		hc.setMshipFee(10000);
		hc.setVIP(1);//vip등급값
		hc.setYn(false);//탈퇴여부
		
		//메소드를 이용해서 값 출력하기
		System.out.println( hc.getMnumber());
		System.out.println( hc.getProgram());
		System.out.println( hc.getMshipfee());
		System.out.println( hc.getVIP());
		System.out.println( hc.getYn());
		
		Student st = new Student();
		
		st.setName("홍길동");
		st.setDept("소프트웨어공학");
		st.setJumsu(90);
		
		System.out.println( st.getName());
		System.out.println( st.getDept());
		System.out.println( st.getJumsu());
		
>>>>>>> refs/remotes/origin/master
	}

}
