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
                                   //s1 과 s2를 비교한다 비교내용은 new~클래스에서 담당
	    System.out.println(result);
	    if(result < 0) System.out.println("s1객체가 s2객체보다 번호가 앞번호입니다");
	    else if (result ==0) System.out.println("s1객체가 s2객체와 같은번호");
	    else System.out.println("s1객체가 s2객체보다 뒷번호입니다");
	    
	    Customer c1 = new Customer("삼성");
	    Customer c2 = new Customer("엘지");
	    Customer c3 = new Customer("코스코");
	    
	    result = Object.compare(c1, c2, new CustomerCompartor());
	    if(result < 0) System.out.println(c1.cName + "이" +c2.cName + "보다 우선 선정 대상입니다");
	    else if(result == 0) System.out.println("같으업체입니다");
	    else System.out.println(c2.cName + "이" + c1.cName + "보다 우선선정대상입니다");
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
//		if(a.cName.equals("삼성")) com1 =1;
//		else if (a.cName.equals("엘지")) com1 =3;
//		else if(a.cName.equals("코스코")) com1 =2;
//		
//		if(b.cName.equals("삼성")) com1 =1;
//		else if (b.cName.equals("엘지")) com1 =3;
//		else if(b.cName.equals("코스코")) com1 =2;
//		
////		if(com1 < com2) return -1;
////		else if (com1 == com2) return 0;
////		else return 1;
		
	}
}
