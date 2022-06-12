package ch04;

public class ClassEx01 {

	public static void main(String[] args) {
		A a = new A(); //a라는 객체 생성 (기본생성자)
		
		//필드안에 값을 넣는 방법1
		//1. 직접 넣는다
		//a.kor = 100;
		//a.eng = 80;
		//2. 메소드를 이용해 넣기
		//a.setKor(100);
		//a.setEng(80);
		//3 생성자를 이용하여 넣기
		A a1 = new A(100, 80); //명시적 생성자
		
		//필드값 출력 방법
		//1 필드를 직접 직는다
		//비권장 사항
		//System.out.println(a1.kor);
		//System.out.println(a1.eng);
		//2 메소드를 이용해 찍는다
		System.out.println(a1.getKor());
		System.out.println(a1.getEng());
		

	}

}

class A{
	int kor; //100
	int eng; //80
	
	public void setKor(int k) {
		kor = k;
		
	}
	public void setEng(int e) {
		eng = e;
	}
	public int getKor() {
		return kor;

	}
    public int getEng() {
    	return eng;
    }
	public A() {
		// 기본생성자 - 컴파일러 생성자가 아무것도없어서 자동으로 만들어준다
	}
	public A( int a, int b) {
		//명시적 생성자 - 프로그래머가 만들어줘야한다
		kor = a;
		eng = b;
	}
}
class B{
	
}