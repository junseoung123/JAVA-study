package ch03;

public class A {
	int iafield;
	static int safield;
	void imethod() { }
	static void samethod( ) { }
	public A() { }
	
	void iaMethod2() {
		int ii=20;
		
		class B{
			int ibfield =100;
			//static int si = 30;
			//static int sbfield=40;
			void ibMethod() {
				// ii = 30;
				ibfield=1000;
				iafield=10;
				A.safield=20;
				imethod();
				A.samethod();
				System.out.println(ibfield + " " + iafield);
			}
			//static void sbMethod() { }
			public B() { }
		}
		B b = new B();
		b.ibfield=200;
		b.ibMethod();
	}
	
	static void saMethod2() {
		class C {
			int icfield=30;
			//static int scfield = 40;
			void scMethod() {
				icfield = 1000;
				//iafield=10;
				A.safield=20;
				
				A.samethod();
				System.out.println(icfield + " " + A.safield);
				
			}
			//static void sccMethod() {
				
			}
		C c = new C();
		c.scMethod();
		}
	}


