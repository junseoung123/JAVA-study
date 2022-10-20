package ch10;

import java.util.Arrays;

public class GenericEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Course<Person> personCourse = new Course<Person>("일반인과정", 5);
		 personCourse.add(new Person("일반인"));

	}
	public static void registerCourse( Course<?> course) {
		System.out.println(course.getName() + "수강생" + Arrays.toString(course.getStudents()));
	}

}
 
class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		
		this.name = name;
		students = (T[]) (new Object[capacity]);
	}

	public String getName() {
		return name;
	}


	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] =t;
				break;
			}
		}
	}
}

class Person{
	
	public Person(String s) {
		
	}
	public Person() {
		
	}
	
}
class Worker extends Person {
	
	
	
}
class Student extends Person {
	
}
class HighStudent extends Student {
	String name;
	
	public String getName() {
		return name;
	}
	
	
}

class Box<T> {
	T t;
}

class BoxBox<T, V> extends Box<T> {
	V value;
	
}

class BoxBoxBox <T, V, W>extends BoxBox<T, V> {
	W width;
	
}