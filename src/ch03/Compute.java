package ch03;

public class Compute extends Calculator{
	@Override
	double areaCircle(double r) {
	    System.out.println("compute Ŭ������ areaCircle(double) �޼ҵ�");
	    System.out.println("----------");
	    super.areaCircle(r); //�θ��� �޼ҵ� ȣ��
		return Math.PI * r * r;
	}
	//@Override
	//int fMethod(int a, String b, boolean c) {
		// TODO Auto-generated method stub
		//return super.fMethod(a, b, c);
	//}

}
