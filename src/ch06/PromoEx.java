package ch06;

public class PromoEx {

	public static void main(String[] args) {
		// 305
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; // A a1 = new B();
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 =d;
		C c1 =e;
		
		// B b3 = e; e변수안에 B클래스가 없다 상속관계 아님
		// C c2 = d;
		a1.m();
		a2.m();
		a3.m();
		a4.m();
		b1.m();
		c1.m();
		
	}
}

class A{ 
	public void m() {System.out.println("표준자료");}
	
}

class B extends A {
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("한국타이어 자료, 오라클 자료");
	}
}

class C extends A {
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("금호타이어 자료, mySql");
	}
}

class D extends B {
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("미쉐린타이어 자료, mogoDB자료");
	}
}

class E extends C {
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("외제타이어, 네이버클라우드 DB");
	}
}