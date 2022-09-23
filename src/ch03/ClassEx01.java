package ch03;

public class ClassEx01 {

	public static void main(String[] args) {
		// 클래스 - 설계도
		// 객체 - 물리적자료
		// 올려주는 동작 - 인스턴스화(객체화) instance
		// 클래스를 만들어 두고 객체화를 하지 않았다면 실제 사람 정현희 넣을수없다
	person p1 = new person();
		p1.name = "정현희";
		p1.teacherJumsu = 90;
		p1.phone = "0101010";
		
		p1.outputName();
		p1.outputTeacherJumsu();
		p1.outputPhone();
		
	Student s1= new Student();
		s1.hakjum = "89";
		s1.hakbun = 13;
		
		s1.outputhakjum();
		s1.outputhakbun();
		
	//shop sh1= new shop();
		//sh1.Yn(true);
		//sh1.Memo("개어렵네");
		//sh1.price =(1.0);
		

		

	}

}
