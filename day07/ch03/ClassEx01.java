package ch03;

public class ClassEx01 {

	public static void main(String[] args) {
		// Ŭ���� - ���赵
		// ��ü - �������ڷ�
		// �÷��ִ� ���� - �ν��Ͻ�ȭ(��üȭ) instance
		// Ŭ������ ����� �ΰ� ��üȭ�� ���� �ʾҴٸ� ���� ��� ������ ����������
	person p1 = new person();
		p1.name = "������";
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
		//sh1.Memo("����Ƴ�");
		//sh1.price =(1.0);
		

		

	}

}
