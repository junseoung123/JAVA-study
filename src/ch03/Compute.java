package ch03;

public class Compute extends Calculator{
	@Override
	double areaCircle(double r) {
	    System.out.println("compute 클래스의 areaCircle(double) 메소드");
	    System.out.println("----------");
	    super.areaCircle(r); //부모의 메소드 호출
		return Math.PI * r * r;
	}
	//@Override
	//int fMethod(int a, String b, boolean c) {
		// TODO Auto-generated method stub
		//return super.fMethod(a, b, c);
	//}

}
