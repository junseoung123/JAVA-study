package ch02;

public class A {
	int iafield;
	static int safield;
	
	void iMethod() {
		iafield = 1;
		A.safield =2;
		A.saMethod();
		//ibfield=3; ���� Ŭ���� B�� �ν��Ͻ� ���������
		B.sbfield =4;
		//biMethod(); ���� Ŭ���� B�� �ν��Ͻ� ���������
		B.bsMethod();
	}
	static void saMethod() {
		A.safield =5;
		B.sbfield =4;
		//B.bsMethod();
		//ibfield=6;  X
	}
	
	public A() {
		System.out.println("�⺻������ �κ�");
	}
	public A(int iafield) {
		this.iafield = iafield;
		System.out.println("����� �����ںκ�");
	}
	
	static class B{
		int ibfield;
		static int sbfield;
		void biMethod() {
			ibfield = 100;
			B.bsMethod();
			//iafield = 1000; //�ۿ��ִ� �ν��Ͻ� ��� ���Ұ�
			A.safield =2000;
			//iMethod(); //�ۿ��ִ� �ν��Ͻ� ��� ���Ұ�
			A.saMethod();
		}
		static void bsMethod() { 
			B.sbfield=200;
			A.safield=2000;
		}
		public B() {
			System.out.println(" B class �⺻������");
		}
		public B(int ibfield) {
			System.out.println("B class �����������");
		}
	}

}
