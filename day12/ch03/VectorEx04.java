package ch03;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class VectorEx04 {

	public static void main(String[] args) {
		Student s1 = new Student(2000, 100);
		Student s2 = new Student(2001, 90);
		Student s3 = new Student(2002, 80);
		Student s4 = new Student(2003, 80);
		
		List<Student> slist = new ArrayList<Student>();
		
		List<Student> vlist = new Vector<Student>();
		
		List<Student> linkList = new LinkedList<Student>();
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
		vlist.add(s1);
		vlist.add(s2);
		vlist.add(s3);
		vlist.add(s4);
		
		linkList.add(s1);
		linkList.add(s2);
		linkList.add(s3);
		linkList.add(s4);
		
		Arrays.asList(s1, s2, s3, s4);
		
		//slist for 반복문
		//vlist for(  :  ) 향상된
		//linkedList interator()
		Student s5 = new  Student(1999, 50);
		slist.add(2, s5);
		vlist.add(2, s5);
		linkList.add(2, s5);
		
		
		slistPrint(slist);
		vlistPrint(vlist);
		linkedListPrint(linkList);
		
		System.out.println(slist.contains(s1));
		System.out.println();
		System.out.println(vlist.contains(s2));
		

	}
	static void slistPrint(List slist) {
		for(int i=0; i<slist.size(); i++) {
			System.out.println(slist.get(i));
		}
	}
	
	static void vlistPrint(List vlist) {
		for(Object s : vlist) {
			System.out.println(s);
		}
	}
	
	static void linkedListPrint(List linkList) {
		Iterator<Student> it1 = linkList.iterator();
		while(it1.hasNext()) {
			Student s = it1.next();
			System.out.println(s);
			}
	}

}

class Student{
	int sno;
	int jumsu;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	public Student(int sno, int jumsu) {
		super();
		this.sno = sno;
		this.jumsu = jumsu;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sno + " " + jumsu;
	}
	
	
	
}
