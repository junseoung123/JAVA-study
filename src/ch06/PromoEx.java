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
		
		// B b3 = e; e�����ȿ� BŬ������ ���� ��Ӱ��� �ƴ�
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
	public void m() {System.out.println("ǥ���ڷ�");}
	
}

class B extends A {
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("�ѱ�Ÿ�̾� �ڷ�, ����Ŭ �ڷ�");
	}
}

class C extends A {
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("��ȣŸ�̾� �ڷ�, mySql");
	}
}

class D extends B {
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("�̽���Ÿ�̾� �ڷ�, mogoDB�ڷ�");
	}
}

class E extends C {
	@Override
	public void m() {
		// TODO Auto-generated method stub
		System.out.println("����Ÿ�̾�, ���̹�Ŭ���� DB");
	}
}