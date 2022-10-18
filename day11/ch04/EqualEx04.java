package ch04;

public class EqualEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("2000", "홍길동");
		Student s2 = new Student("2000", "최민경");
		
		if(s1.equals(s2)) System.out.println("같은사람");
		else System.out.println("다른사람");

	}

}

class Student {
	String hakbun;
	String name;
	
	public Student(String hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}
	//hashCode() 학번이 같으면 동등객체 1차판단
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(hakbun);
	}
	//equals() 동등객체 2차판단
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			//1단계 down casting
			Student s = (Student) obj;
			if(hakbun.equals(s.hakbun) && name.equals(s.name)) return true;
			else return false;
		}
		return false;
	}
}
