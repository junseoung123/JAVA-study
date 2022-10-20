package ch01;

import java.util.*;

public class TreeSetEx01 {

	public static void main(String[] args) {


		List arr1 = new ArrayList<>();
		arr1.add(new Student(2000,"È«±æµ¿"));
		arr1.add(new Student(2020,"ÀÌ¼ø½Å"));
		
		arr1.add(1, new Student(1999,"Á¤ÇöÈñ"));
		
		System.out.println(arr1.size());
		
		arr1.remove("ÀÌ¼ø½Å");
		
		arr1.set(1, new Student(1998,"Á¤ÇöÈñ"));
		
		Iterator<Student> it1 = arr1.iterator();
		Student search = null;
		while(it1.hasNext()) {
			Student s=it1.next();
			System.out.println(s.getName());
			if(s.getName().equals("È«±æµ¿")) search = s;
		}
		if(search == null) System.out.println("¿ì¸®ÇÐ»ý ¾Æ´Ô");
		else {System.out.println("Ã£¾Ò½ººó´Ù");
		      System.out.println(arr1.contains(search));
		}
		arr1.add(new Student(2000,"È«±æµ¿"));

	}

}

class Student{
	int sno;
	String name;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
}
