package ch05;

public class Process01 {
	
	static int a;
	static {
		System.out.println("이곳은 정적 블록 인곳");
		a = 10;
		
	}
	{
		System.out.println("이곳은 인스턴스 블록 인곳");
		a = 20;
		
	}
	
	public Process01() {
		System.out.println("이곳은 기본생성자 입니다");
		a = 30;
	}
	public static void sMethod() {
		System.out.println("이곳은 정적 인곳");
		a = 40;
	}
    public void iMethod() {
	    System.out.println("이곳은 인스턴스 블록 인곳");
	    a = 50;
}
	

}
