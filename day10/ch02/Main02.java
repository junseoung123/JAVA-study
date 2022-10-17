package ch02;

public class Main02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A a = new A();
		//a.iMethod();
		//A.saMethod();
		
		A.B b = new A.B();
		b.ibfield = 50;
		b.biMethod();
		A.B.sbfield =100;
		A.B.bsMethod();

	}

}
