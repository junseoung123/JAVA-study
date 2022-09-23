package ch02;

public class Office extends Parent{
	
	String sabun;
	public void gotoWork() {
		System.out.println("회사에 출근한다..");
	}
	
	public void allPrint() {
		System.out.println(name + " " + age + " " + sabun);
		eat();
		sleep();
		gotoWork();
	}

	public String getSabun() {
		return sabun;
	}

	public void setSabun(String sabun) {
		this.sabun = sabun;
	}

}
