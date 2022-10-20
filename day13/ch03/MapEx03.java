package ch03;

import java.util.*;

public class MapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map map1 = new Hashtable<String, Integer>();
		
		Person p1 = new Person("È«±æµ¿", 30);
		Person p2 = new Person("ÀÌ¼ø½Å", 23);
		Person p3 = new Person("Á¤ÇöÈñ", 34);
		Person p4 = new Person("¹Ú¸í¼ö", 40);
		Person p5 = new Person("È«±æµ¿", 30);
		Person p6 = new Person("È«±æµ¿", 30);
		Person p7 = new Person("È«±æµ¿", 35);
		
		map1.put(p1.getName() + " " +p1.getAge(), p1.getAge());
		map1.put(p2.getName() + " " +p2.getAge(), p2.getAge());
		map1.put(p3.getName() + " " +p3.getAge(), p3.getAge());
		map1.put(p4.getName() + " " +p4.getAge(), p4.getAge());
		map1.put(p5.getName() + " " +p5.getAge(), p5.getAge());
		map1.put(p6.getName() + " " +p6.getAge(), p6.getAge());
		map1.put(p7.getName() + " " +p7.getAge(), p7.getAge());
		
		System.out.println(map1.get(p1.getName()));
		
		Set<String> ks = map1.keySet();
		Iterator<String> itks = ks.iterator();
		while(itks.hasNext()) {
			String s = itks.next();
			System.out.println(s + " " + map1.get(s));
		}
		
		Set<Map.Entry<String, Integer>> es = map1.entrySet();
		Iterator<Map.Entry<String, Integer>> ites = es.iterator();
		while(ites.hasNext()) {
			Map.Entry<String, Integer> s = ites.next();
			System.out.println(s.getKey() + " " + s.getValue());
		}

	}

}

class Person{
	String name;
	int age;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(name.equals(p.name) && age == p.age) return true;
			}
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
