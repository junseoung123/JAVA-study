package ch08;

import java.util.Arrays;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		char[] arr2 = Arrays.copyOf(arr1, 2);
		char[] arr3 = new char[10];
		
		System.arraycopy(arr1, 0, arr3, 0, 4);
		
		for(char a : arr1) {
			System.out.println(a + " ");
		}
		System.out.println();
		
		for(char a : arr2) {
			System.out.println(a + " ");
		}
		
		System.out.println();
		
		for(char a : arr3) {
			System.out.println(a + " ");
		}
		
		System.out.println();
		
		int[] number = {3,6,0,10,4};
		
		for(int n : number ) {
			System.out.println(n+ " ");
		}
		
		Arrays.sort(number);
		System.out.println();
		for(int n : number) {
			System.out.println(n + " ");
			
		}
		
		System.out.println(Arrays.binarySearch(number, 8));
		int searchNumber = 8;
		if(Arrays.binarySearch(number, searchNumber) < 0) {
			System.out.println(searchNumber + "���ڴ� �迭�ȿ� ���� �����Դϴ�");
		} else {
			System.out.println(Arrays.binarySearch(number, searchNumber) + "��° �ִ� �����Դϴ�");
		}
		
		String[] text = {"A", "Z", "c", "a", "0", "!"};
		Arrays.sort(text);
		
		System.out.println();
		for(String t : text) {
			System.out.print(t + " ");
			
		}
		Arrays.sort(text);
		
		System.out.println("\n <<���ڿ� ���� �˻��ϱ�>>");
		Arrays.binarySearch(text, "a");
		System.out.println(Arrays.binarySearch(text, "a") + "~~");
		
		
		
		
		Student s1 = new Student(2000, "ȫ�浿");
		Student s2 = new Student(2000, "�̼���");
		Student s3 = new Student(1999, "�ֹμ�");
		
		Student[] sArr = {s1, s2, s3};
		Arrays.sort(sArr);
		
		for(Student s : sArr) {
			System.out.println(s.getSname());
			
		}
		
		Student s4 = new Student(2000, "������1", "��ǻ�Ͱ��а�");
		Student s5 = new Student(2000, "������2", "�����ΰ�");
		Student s6 = new Student(2000, "������3", "���ǰ�");
		Student s7 = new Student(2000, "������4", "ü����");
		
		Student[] sArr2 = {s4, s5,s6,s7};
		Arrays.sort(sArr2);
		for(Student s : sArr2) {
			System.out.println(s.getHak()+ " " + s.getSno() + " " + s.getSname());
		}
		
		System.out.println("\n <<��ü�ڷ� ���� �˻��ϱ�>>");
		Arrays.binarySearch(sArr2, s6);
		System.out.println(Arrays.binarySearch(sArr2, s6) + "~~");
		int i;
		boolean flag = false;
		for( i=0; i < sArr2.length; i++) {
			if(sArr2[i].hak.equals("�����ΰ�")) break;
		}
		Student searchAdd = sArr2[i-1];
		if(flag) {searchAdd=sArr2[i];}
		else {System.out.println("�׷��а� �����ϴ�"); }
		
		int searchIndex=Arrays.binarySearch(sArr2, searchAdd);
		if(searchIndex <0) {
			System.out.println("����");
		}else {
			System.out.println(sArr2[searchIndex].getSno() + " " +sArr2[searchIndex].getSname());
		}
		

	}

}

class Student implements Comparable<Student>{
	int sno;
	String sname;
	String hak;
	
	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return o.sno - sno;
		
		return sname.compareTo(o.sname);
	}
	
	
	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}
	
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
		
	}
	
	public Student(int sno, String sname, String hak) {
		super();
		this.sno =sno;
		this.sname = sname;
		this.hak = hak;
	}
}