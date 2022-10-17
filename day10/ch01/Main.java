package ch01;

public class Main {

	public static void main(String[] args) {


		A a = new A();
		a.iaMethod();
		a.siaMethod();
		
		
		A.B b = a.new B();
		b.ibMethod();
		b.bfield = 100;

	}

}
