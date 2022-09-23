package ch01;

public class AdminManager {
	
	int number;
	boolean yn;
	String name;
	String school;
	
	public AdminManager() {
		number=0;
		yn=false;
		name=null;
		school=null;
		System.out.println("기본생성자부분임----1");
	}
	public AdminManager(int number, boolean yn) {
		this();
		this.number=number;
		this.yn=yn;
		System.out.println("명시적 생성자 부분임----2");
		
	}
	public AdminManager(String name, String school) {
		this(1000, true);
		this.name=name;
		this.school=school;
		System.out.println("명시적 생성자 부분임---3");
		
	}

}
