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
		System.out.println("�⺻�����ںκ���----1");
	}
	public AdminManager(int number, boolean yn) {
		this();
		this.number=number;
		this.yn=yn;
		System.out.println("����� ������ �κ���----2");
		
	}
	public AdminManager(String name, String school) {
		this(1000, true);
		this.name=name;
		this.school=school;
		System.out.println("����� ������ �κ���---3");
		
	}

}
