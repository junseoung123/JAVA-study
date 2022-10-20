package ch04;

import java.util.*;

public class TreeEx04 {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동",100, true);
		Student s2 = new Student("정현희",80, false);
		Student s3 = new Student("이순신",90, true);
		Student s4 = new Student("최수진",75, false);
		
		TreeSet<Student> ts = new TreeSet<Student>();
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//first하기
		System.out.println("---first찍기---");
		System.out.println(ts.first().getName());
		
		System.out.println("---Last찍기---");
		System.out.println(ts.last().getName());
		
		
	}

}

class Student implements Comparable<Student>{
	String name;//학생명
	int jumsu;//점수
	boolean gender;//성별
	
//	@Override
//	public int compareTo(Student o) {
//		if(name.compareTo(o.name) < 0) return -1;
//		else if(name.compareTo(o.name) == 0) return 0;
//		else return 1;
//		//return name.compareTo(o.name);
//	}
	
	@Override
	public int compareTo(Student o) {
		if(jumsu - o.jumsu < 0) return -1;
		else if (jumsu - o.jumsu ==0) return 0;
		else return 1;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Student(String name, int jumsu, boolean gender) {
		super();
		this.name = name;
		this.jumsu = jumsu;
		this.gender = gender;
	}
	
}
		/*TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("2");
		ts.add("3");
		ts.add("0");
		ts.add("5");
		ts.add("7");
		
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.lower("2"));
		System.out.println(ts.higher("2"));
		System.out.println(ts.ceiling("2"));
		
		System.out.println("------------------");
		
		Iterator<String> itts = ts.iterator();//모두출력
		while(itts.hasNext()) {
			System.out.println(itts.next());
		}
		
		System.out.println("----------------------");
		
		Iterator<String> dit = ts.descendingIterator();//내림차순
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
		
		System.out.println("----------------------");
		
		NavigableSet<String> ds = ts.descendingSet();//내림차순
		for(String d : ds) {
			System.out.println(d);
		}
		
		System.out.println("----------------------");//내림차순 한번 더해서 오름차순
		NavigableSet<String> dds = ds.descendingSet();
		for(String d : dds) {
			System.out.println(d);
		}
		
		System.out.println("----------------------"); //5보다 작은값
		Set<String> hs = ts.headSet("5", true); //true면 5를 포함해서
		                                        //false면 5미만인거 (기본)
		
		for(String h : hs) {
			System.out.println(h);
		}
		
		System.out.println("----------------------"); //3~7까지 출력
		Set<String> tss = ts.subSet("3" , true, "7", true); //3도포함해서 7도포함까지
		                                        //false면 5미만인거 (기본)
		
		for(String h : tss) {
			System.out.println(h);
		}
		
		System.out.println(ts.contains("5"));//5가 잇나요?
		*/
		
		


		
		
		
		

		/*
		 * TreeSet<Integer> set1 = new TreeSet<Integer>();
		 * set1.add(new Integer(10));
		set1.add(new Integer(0));
		set1.add(new Integer(3));
		set1.add(new Integer(8));
		set1.add(new Integer(10));
		set1.add(new Integer(-12));
		
		//자동 오름차순 전체 출력
		Iterator<Integer> it1 = set1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println(set1.first());//왼쪽 가장 작은수
		System.out.println(set1.last());//가장 오른쪽
		
		System.out.println(" " + set1.lower(new Integer(3)));
		System.out.println(" " + set1.higher(new Integer(3)));
		
		System.out.println(set1.pollFirst());
		System.out.println(set1.pollLast());
		
		System.out.println(set1.first());
		System.out.println(set1.last());
		*/


