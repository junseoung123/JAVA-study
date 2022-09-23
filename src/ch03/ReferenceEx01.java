package ch03;

public class ReferenceEx01 {

	public static void main(String[] args) {
		// 힙메모리에 올리기, 객체생성, 인스턴스화하기
		Class1 c1 = new Class1();
		Class1 c2 = new Class1();
		Class1 c3 = c1;
		
		System.out.println( c1 == c2);
		System.out.println( c1 == c3);
		
		System.out.println( c2 == c3);
		
		Class2 c = new Class2();
		
		Class2 c4 = c;
		Class2 c5 = null;
		Class1 c6 = null;
		
		System.out.println( c4 == c5);
		
		c1.a = 300;
		c1.cM();
		
		//가르키는 주소가없어서 예외처리
		/*c2 = null;
		c2.a = 400;
		c2.cM();*/

	}

}
