package ch12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredictateEx {
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", "남자", 90),
			new Student("김순희", "여자", 90),
			new Student("김자바", "남자", 95),
			new Student("박한나", "여자", 92)
			);
	
	//T는 무엇일까 Student
	// Predicate<Student> p = t->t.getSex().equals("남자")	
	private static double avg(Predicate<Student> p) {
		int count =0, sum=0;
		for(Student student : list) {
			if(p.test(student) ) {
				count++;
				sum += student.getScore();
			}
		}
		
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg= avg( t-> t.getSex().equals("남자"));
		System.out.println(maleAvg);
		
		double femaleAvg= avg( t-> t.getSex().equals("여자"));
		System.out.println(femaleAvg);

	}
	 
	

	

}

class Student {
	private String neme;
	private String sex;
	private int score;
	public String getNeme() {
		return neme;
	}
	public void setNeme(String neme) {
		this.neme = neme;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(String neme, String sex, int score) {
		super();
		this.neme = neme;
		this.sex = sex;
		this.score = score;
	}
	
}
