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
		
		System.out.println(r + "�� �������� ���� ���� =>" + r*r*PI + "final ������ �ٲٴ°� �ƴ϶� �̿븸��" + (a+100));
	}
}