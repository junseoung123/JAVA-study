package ch02;

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("십원과 10이 같은지 판단하기");
		if(a.equals(10))
			System.out.println("같다");
		else
			System.out.println("다르다");

	}

}

class A {
	String pay1="십원";
	int pay2=10;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(pay1.equals("십원") && pay2==10) {
			return true;
		} else {
			return false;
		}
		//return super.equals(obj);
	}@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}




