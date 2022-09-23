package ch07;

public class StaticFinalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstrantEx ce = new ConstrantEx();
		ce.area(5);
		

	}

}

class ConstrantEx {
	static final double PI = 3.141592;
	final int a =10;
	
	void area (int r) {
		
		System.out.println(r + "이 반지름인 원의 넓이 =>" + r*r*PI + "final 변수를 바꾸는게 아니라 이용만함" + (a+100));
	}
}