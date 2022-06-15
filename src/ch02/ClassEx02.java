package ch02;

public class ClassEx02 {

	public static void main(String[] args) {
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
		

	}

}
