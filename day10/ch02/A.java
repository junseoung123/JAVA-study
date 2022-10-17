package ch02;

public class A {
	int iafield;
	static int safield;
	
	void iMethod() {
		iafield = 1;
		A.safield =2;
		A.saMethod();
		//ibfield=3; 내부 클래스 B의 인스턴스 멤버사용못함
		B.sbfield =4;
		//biMethod(); 내부 클래스 B의 인스턴스 멤버사용못함
		B.bsMethod();
	}
	static void saMethod() {
		A.safield =5;
		B.sbfield =4;
		//B.bsMethod();
		//ibfield=6;  X
	}
	
	public A() {
		System.out.println("기본생성자 부분");
	}
	public A(int iafield) {
		this.iafield = iafield;
		System.out.println("명시적 생성자부분");
	}
	
	static class B{
		int ibfield;
		static int sbfield;
		void biMethod() {
			ibfield = 100;
			B.bsMethod();
			//iafield = 1000; //밖에있는 인스턴스 멤버 사용불가
			A.safield =2000;
			//iMethod(); //밖에있는 인스턴스 멤버 사용불가
			A.saMethod();
		}
		static void bsMethod() { 
			B.sbfield=200;
			A.safield=2000;
		}
		public B() {
			System.out.println(" B class 기본생성자");
		}
		public B(int ibfield) {
			System.out.println("B class 명시적생성자");
		}
	}

}
