package ch04;

import java.util.*;

public class TreeEx04 {

	public static void main(String[] args) {
		
		Student s1 = new Student("ȫ�浿",100, true);
		Student s2 = new Student("������",80, false);
		Student s3 = new Student("�̼���",90, true);
		Student s4 = new Student("�ּ���",75, false);
		
		TreeSet<Student> ts = new TreeSet<Student>();
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//first�ϱ�
		System.out.println("---first���---");
		System.out.println(ts.first().getName());
		
		System.out.println("---Last���---");
		System.out.println(ts.last().getName());
		
		
	}

}

class Student implements Comparable<Student>{
	String name;//�л���
	int jumsu;//����
	boolean gender;//����
	
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
		
		Iterator<String> itts = ts.iterator();//������
		while(itts.hasNext()) {
			System.out.println(itts.next());
		}
		
		System.out.println("----------------------");
		
		Iterator<String> dit = ts.descendingIterator();//��������
		while(dit.hasNext()) {
			System.out.println(dit.next());
		}
		
		System.out.println("----------------------");
		
		NavigableSet<String> ds = ts.descendingSet();//��������
		for(String d : ds) {
			System.out.println(d);
		}
		
		System.out.println("----------------------");//�������� �ѹ� ���ؼ� ��������
		NavigableSet<String> dds = ds.descendingSet();
		for(String d : dds) {
			System.out.println(d);
		}
		
		System.out.println("----------------------"); //5���� ������
		Set<String> hs = ts.headSet("5", true); //true�� 5�� �����ؼ�
		                                        //false�� 5�̸��ΰ� (�⺻)
		
		for(String h : hs) {
			System.out.println(h);
		}
		
		System.out.println("----------------------"); //3~7���� ���
		Set<String> tss = ts.subSet("3" , true, "7", true); //3�������ؼ� 7�����Ա���
		                                        //false�� 5�̸��ΰ� (�⺻)
		
		for(String h : tss) {
			System.out.println(h);
		}
		
		System.out.println(ts.contains("5"));//5�� �ճ���?
		*/
		
		


		
		
		
		

		/*
		 * TreeSet<Integer> set1 = new TreeSet<Integer>();
		 * set1.add(new Integer(10));
		set1.add(new Integer(0));
		set1.add(new Integer(3));
		set1.add(new Integer(8));
		set1.add(new Integer(10));
		set1.add(new Integer(-12));
		
		//�ڵ� �������� ��ü ���
		Iterator<Integer> it1 = set1.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println(set1.first());//���� ���� ������
		System.out.println(set1.last());//���� ������
		
		System.out.println(" " + set1.lower(new Integer(3)));
		System.out.println(" " + set1.higher(new Integer(3)));
		
		System.out.println(set1.pollFirst());
		System.out.println(set1.pollLast());
		
		System.out.println(set1.first());
		System.out.println(set1.last());
		*/


