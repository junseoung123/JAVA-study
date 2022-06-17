package ch03;

public class AB extends A{
    int abfield;
	
	public void aMethod() {
		System.out.println("AB클래스의 매소드 푸분임");
		System.out.println(abfield);
	}
	public AB() {
		System.out.println("AB 믈래스의 기본생성자 부분임");
		abfield = 400;
	}

}
