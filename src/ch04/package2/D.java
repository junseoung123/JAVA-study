package ch04.package2;

import ch04.package1.A;
//다른 패키지지만 자식클래스라 사용가능
public class D extends A{
	public D() {
		
		super();
		super.field = "value2";
				this.field = "value2";
				method(); //A클래스의 메소드 호출가능
		
	}
	public void method() {
		
	}

}
