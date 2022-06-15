package ch02;

public class Student extends Parent{
	String hakbun;
	public void goingToSchool() {
		System.out.println("등교하기");
	}
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	
	public void allPrint() {
		System.out.println(name + " " + age + " " + hakbun);
		eat();
		sleep();
		goingToSchool();
		
	}

	
}
