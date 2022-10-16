package ch02;

public class SmartPhone extends Phone{
	//일반클래스가 추상클래스를 부모로 삼을 경우 부모클래스의 추상메소드를 반드시 재정의해야한다
	@Override
	void abMethod1() {
		// TODO Auto-generated method stub
		System.out.println("이곳은 자식 smartphone클래스 부모 phone클래스 재정의1");
	}
	@Override
	void abMethod2() {
		// TODO Auto-generated method stub
		System.out.println("이곳은 자식 smartphone클래스 부모 phone클래스 재정의1");
		
	}
	
	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("일반메소드 재정의 가능하지만 안해도댐");
	}

}
