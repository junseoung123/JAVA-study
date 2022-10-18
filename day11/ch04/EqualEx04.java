package ch04;

public class EqualEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("2000", "ȫ�浿");
		Student s2 = new Student("2000", "�ֹΰ�");
		
		if(s1.equals(s2)) System.out.println("�������");
		else System.out.println("�ٸ����");

	}

}

class Student {
	String hakbun;
	String name;
	
	public Student(String hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}
	//hashCode() �й��� ������ ���ü 1���Ǵ�
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Integer.parseInt(hakbun);
	}
	//equals() ���ü 2���Ǵ�
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			//1�ܰ� down casting
			Student s = (Student) obj;
			if(hakbun.equals(s.hakbun) && name.equals(s.name)) return true;
			else return false;
		}
		return false;
	}
}
