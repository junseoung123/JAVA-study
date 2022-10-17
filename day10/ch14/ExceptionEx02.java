package ch14;

public class ExceptionEx02 {

	public static void main(String[] args) throws NullPointerException{
		// TODO Auto-generated method stub
		try {
		A a = new A();
		a.a1();
		}catch(NullPointerException e) {
			System.out.println("null 예외처리");
			//e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열첨자 예외처리");
			//e.printStackTrace();
		}

	}

}

class A{
	void a1()  throws NullPointerException, ArrayIndexOutOfBoundsException{
		a2();
		System.out.println("a1 ====>");
	}
	
	void a2() throws NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException{
		a3();
		System.out.println("a2 ====>");
		int k=10/0;
	}
	
	void a3() throws NullPointerException, ArrayIndexOutOfBoundsException{
		a4();
		System.out.println("a3 ====>");
		int[] a = {10,20,30};
		a[4] =40;
	}
	
	void a4() throws NullPointerException{
		String data="null";
		System.out.println(data.toString());
		System.out.println("a4===>");
		
	}
}
