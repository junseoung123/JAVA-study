package ch04;

import java.util.Arrays;
import java.util.List;

public class StreamEx04 {

	public static void main(String[] args) {
		// 784     
		//1 컬렉션 자료 배열자료를 오리지널 스트림 만들어야함 필수 - 명령
		//2 중간처리 필요하면 하기 선택사항
		//3 최종처리 필수 프로그램하지않으면 답 안나옴 에러
		//스틤을 결과를 본것은 1번만 볼수있다 다시 결과만 보려면 에러가 난다
		
		//834까지만 공부하기
		
		//796
		
		//1단계 오리지널 스트림으로 만들기
		List<Member> list = Arrays.asList(
				new Member( "홍길동",Member.MALE, 30 ),
				new Member( "김나리",Member.FEMALE, 20 ),
				new Member( "신용권",Member.MALE, 45 ),
				new Member( "박수미",Member.FEMALE, 27 )
				);
		
		double ageAvg = list.stream()
				.filter(m->m.getSex() == Member.MALE) //걸러낸다
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		
		System.out.println(ageAvg);
		
		
		//여자 나이 합계
		
		int femaleAgeSum = list.stream()
				.filter(m->m.getSex() == Member.FEMALE) //걸러낸다
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
