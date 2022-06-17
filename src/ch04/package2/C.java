package ch04.package2;

import ch04.package1.B;

public class C {
	
	public void method() {
		//A클래스 객체 생성하기
		//A a = new A(); //안됌 A클래스는 클래스의 생성자의 접근 제한자는 protected이므로 다른 패키지에서 상속관계임
		
		B b = new B(); //접근근 가능한 이유 b클래스의 생성자 메소드는 모드 public 으로 선언되어있기 때문
		
		b.method();
	}

}
