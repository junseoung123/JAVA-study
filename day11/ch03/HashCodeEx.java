package ch03;

import java.util.HashMap;

public class HashCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("admin");
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("동등");
		} else {
			System.out.println("다름");
		}
		System.out.println(member.equals(new Member("aaa")));
		
		HashMap<Key, String> hashMap = new HashMap <Key, String> ();
		Key key1 = new Key(1);
		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(2));
		System.out.println(value);
	}

}

class Member{
	public String id;
	public Member() {
		
	}
	public Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			if(id.equals(m.id)) {
				return true;
				
			} else{
				return false;
			}
		}
		return super.equals(obj);
	}
}

class Key{
	public int number;
	public Key(int number) {
		this.number=number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Key) {
			Key k = (Key)obj;
			if(number == k.number) return true;
			return false;
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return number;
	}
}