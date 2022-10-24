package ch12;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredictateEx {
	
	private static List<Student> list = Arrays.asList(
			new Student("ȫ�浿", "����", 90),
			new Student("�����", "����", 90),
			new Student("���ڹ�", "����", 95),
			new Student("���ѳ�", "����", 92)
			);
	
	//T�� �����ϱ� Student
	// Predicate<Student> p = t->t.getSex().equals("����")	
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
		double maleAvg= avg( t-> t.getSex().equals("����"));
		System.out.println(maleAvg);
		
		double femaleAvg= avg( t-> t.getSex().equals("����"));
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
