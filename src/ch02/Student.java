package ch02;

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
	
	

}
