package ch05;

import java.util.Comparator;
import java.util.Objects;

public class ComparaEx05 {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		int result = Objects.compare(s1, s3, new StudentCompartor());
                                   //s1 �� s2�� ���Ѵ� �񱳳����� new~Ŭ�������� ���
	    System.out.println(result);
	    if(result < 0) System.out.println("s1��ü�� s2��ü���� ��ȣ�� �չ�ȣ�Դϴ�");
	    else if (result ==0) System.out.println("s1��ü�� s2��ü�� ������ȣ");
	    else System.out.println("s1��ü�� s2��ü���� �޹�ȣ�Դϴ�");
	    
	    Customer c1 = new Customer("�Ｚ");
	    Customer c2 = new Customer("����");
	    Customer c3 = new Customer("�ڽ���");
	    
	    result = Object.compare(c1, c2, new CustomerCompartor());
	    if(result < 0) System.out.println(c1.cName + "��" +c2.cName + "���� �켱 ���� ����Դϴ�");
	    else if(result == 0) System.out.println("������ü�Դϴ�");
	    else System.out.println(c2.cName + "��" + c1.cName + "���� �켱��������Դϴ�");
	}

}

class StudentCompartor implements Comparator<Student> {
	
	@Override
	public int compare(Student a, Student b) {
		if( a.sno < b.sno) return -1;
		else if( a.sno == b.sno) return 0;
		else return 1;
	}
	
}

class Student {
	int sno;
	public Student(int sno) {
		this.sno = sno;
	}
	
}

class Customer {
	String cName;
	public Customer(String cName) {
		this.cName = cName;
	}
}*/

//class CustomerCompartor implements Comparator<Customer> {
//	
//	public CustomerCompartor(Customer a, Customer b) {
//		int com1=0, com2=0;
//		if(a.cName.equals("�Ｚ")) com1 =1;
//		else if (a.cName.equals("����")) com1 =3;
//		else if(a.cName.equals("�ڽ���")) com1 =2;
//		
//		if(b.cName.equals("�Ｚ")) com1 =1;
//		else if (b.cName.equals("����")) com1 =3;
//		else if(b.cName.equals("�ڽ���")) com1 =2;
//		
////		if(com1 < com2) return -1;
////		else if (com1 == com2) return 0;
////		else return 1;
		
	}
}
