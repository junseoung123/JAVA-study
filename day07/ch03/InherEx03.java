package ch03;

public class InherEx03 {

	public static void main(String[] args) {
		// 상송의 개념
		// 상속은 부모 자식으로 클래스의 관계를 맺는 것읆 말한다.
		// 강아지(개별화)는 동물(부모)이다 고양이는 동물이다 is~a관계
		
		//자동차는 핸들 가지고있다 바퀴를 가지고있다 has~a포함 관계 import 사용함
		
		//사용관계 - 조립하는것 new
		//집합관계 import has~a 바퀴는 자동차이다 X
		//상속관계 extends is~a 자식클래스는 쿠모클래스이다 강아지는 동물이다
		
		//사용하기
		//A a = new A();
		//AA aa = new AA();
		AAA aaa= new AAA();
		
		System.out.println(aaa.aaafield);
		System.out.println(aaa.aafield);
		System.out.println(aaa.afield);
		System.out.println("---------");
		
		AB ab = new AB();
		System.out.println(ab.abfield);
		System.out.println(ab.afield);
		
		System.out.println("============");
		AA aa1 = new AA(1000);
		System.out.println("aa1.aafield ==>" + aa1.aafield);
		System.out.println("aa1.afield ==>" + aa1.afield);
		
		System.out.println("============");
		AA aa2 = new AA(2000, 5000);
		System.out.println("aa1.aafield ==>" + aa2.aafield);
		System.out.println("aa1.afield ==>" + aa2.afield);
		
		System.out.println("============");
		AAA aaa1 = new AAA(0, 1, 2);
		System.out.println("aa1.aaafield ==>" + aaa1.aaafield);
		System.out.println("aa1.aafield ==>" + aaa1.aafield);
		System.out.println("aa1.afield ==>" + aaa1.afield);
		
		

	}

}
