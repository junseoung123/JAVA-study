package ch06;

import java.util.*;

public class HashSetEx06 {

	public static void main(String[] args) {
		//µ¿µî°´Ã¼ÆÇ´Ü
		
		Member m1 = new Member("È«±æµ¿1", 20);
		Member m2 = new Member("È«±æµ¿2", 20);
		Member m3 = new Member("È«±æµ¿1", 30);
		Member m4 = new Member("È«±æµ¿2", 20);
		
		/*
		Set<Member> mset1 = new HashSet<Member>();
		mset1.add(m1);
		mset1.add(m2);
		mset1.add(m3);
		mset1.add(m4);
		
		Iterator<Member> it1 = mset1.iterator();
		while(it1.hasNext()) {
			Member m = it1.next();
			System.out.println(m.getName() + " " + m.getAge());
		}*/
		
		Member m5 = new Member("È«±æµ¿", 20, "admin", "123-4567");
		Member m6 = new Member("È«±æµ¿", 20, "admin", "123-4567");
		Member m7 = new Member("È«±æµ¿", 20, "admin", "123-4568");
		
		Set mset2 = new HashSet<Member>();
		mset2.add(m5);
		mset2.add(m6);
		mset2.add(m7);
		
		Iterator<Member> it2 = mset2.iterator();
		while(it2.hasNext()) {
			Member m = it2.next();
			System.out.println(m.getName() + " " + m.getAge());
		}
		
		

	}

}


class Member{
	public String name;
	public int age;
	public String id;
	public String phone;
	
	public Member(String name, int age, String id, String phone) {
		super();
		this.name =name;
		this.age = age;
		this.id =id;
		this.phone=phone;
		
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + id.hashCode() + phone.hashCode();
	}
	
	@Override
	public boolean equals(Object obj1) {
		if(obj1 instanceof Member) {
			Member m=(Member)obj1;
			if(name.equals(m.name) && id.equals(m.id) && id.equals(m.phone)) return true;
			else return false;
		}
		return false;
	}
	/*@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			if(name.equals(m.name) && age==m.age) return true;
			else return false;
		}
		return false;
	}*/
	
	
	
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
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age =age;
	}
	
}
