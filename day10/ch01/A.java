package ch01;

public class A {
	int afield; //필드
	static int safield; //상수필드
	// bfield 사용불가
	// ibMethod(); 사용불가
	void iaMethod() { } //메소드
	static void siaMethod() { } //정적메소드
	public A() { } //생성자
	public A(int afield, int  safield) { } //명시적생성자
	
	public class B{
		int bfield; //필드
		//static int sbfield; //상수필드
		void ibMethod() { 
			afield = 100;
			A.safield =200;
			iaMethod();
			A.siaMethod();
			bfield = 400;
			System.out.println("B class ibMethod부분");
			} //메소드
		//static void sibMethod() { } //정적메소드
		public B() {
			super(); //A클래스의 생성자 X    B클래스의 부모인 Object클래스로 간다
		} //생성자
		public B(int bfield, int  sbfield) { } //명시적생성자

	}

}
