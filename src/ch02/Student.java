package ch02;

<<<<<<< HEAD
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

	
=======
public class Student {
	//학생관리
	String name;
	String dept;
	int jumsu;
	
	//setter getter 자동으로 나오게하기
	// source generate getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	
	

>>>>>>> refs/remotes/origin/master
}
