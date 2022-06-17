package ch03;

public class Calculator {
	double areaCircle(double r) {
		System.out.println( " areaCircle 실행");
		return 3.14157 * r * r;
	}
	//메소드에 final붙이면 자식 메소드가 재정의하지 못하게 막는다
    final int fMethod(int a, String b, boolean c) {
    	return 0;
    }
	
	//부모 클래스인 object클래스의 메소드인 toStirng 을 재정의하기
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(areaCircle(20));
	}
	//부모클래스인 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0516;
	}

}
