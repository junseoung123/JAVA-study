package ch04;

import java.util.Arrays;
import java.util.List;

public class StreamEx04 {

	public static void main(String[] args) {
		// 784     
		//1 �÷��� �ڷ� �迭�ڷḦ �������� ��Ʈ�� �������� �ʼ� - ���
		//2 �߰�ó�� �ʿ��ϸ� �ϱ� ���û���
		//3 ����ó�� �ʼ� ���α׷����������� �� �ȳ��� ����
		//��ƺ�� ����� ������ 1���� �����ִ� �ٽ� ����� ������ ������ ����
		
		//834������ �����ϱ�
		
		//796
		
		//1�ܰ� �������� ��Ʈ������ �����
		List<Member> list = Arrays.asList(
				new Member( "ȫ�浿",Member.MALE, 30 ),
				new Member( "�質��",Member.FEMALE, 20 ),
				new Member( "�ſ��",Member.MALE, 45 ),
				new Member( "�ڼ���",Member.FEMALE, 27 )
				);
		
		double ageAvg = list.stream()
				.filter(m->m.getSex() == Member.MALE) //�ɷ�����
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		
		System.out.println(ageAvg);
		
		
		//���� ���� �հ�
		
		int femaleAgeSum = list.stream()
				.filter(m->m.getSex() == Member.FEMALE) //�ɷ�����
				.mapToInt(Member::getAge)
				.sum();			
		
		System.out.println(femaleAgeSum);
				

	}

}


class Member {
	public static int MALE=0;
	public static int FEMALE=1;
	
	private String name;
	private int sex;
	private int age;
	public static int getMALE() {
		return MALE;
	}
	public static void setMALE(int mALE) {
		MALE = mALE;
	}
	public static int getFEMALE() {
		return FEMALE;
	}
	public static void setFEMALE(int fEMALE) {
		FEMALE = fEMALE;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
}
