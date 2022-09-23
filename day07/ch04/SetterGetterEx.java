package ch04;

import ch02.HealthClass;
import ch03.Student;

public class SetterGetterEx {
	//다른 패키지(폴더) 안에 있는 Student 클래스를 객체 생성하려면

	public static void main(String[] args) {

		Student student = new Student();
		
		//student.setName(String[] name);
		student.setName( new String[3]);
		
		//int[] jumsu = new int[3]
		student.setJumsu( new int[3]);
		
		

	}

}
