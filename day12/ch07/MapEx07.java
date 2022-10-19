package ch07;

import java.util.*;

public class MapEx07 {

	public static void main(String[] args) {
		// Map key value
		// 다형성 맴 생성
		
	    Map map1 = new HashMap<Integer, String>();
	    //값넣기
	    map1.put(1, "a");
	    map1.put(2, "b");
	    map1.put(3, "a");
	    map1.put(3, "k");
	    
	    System.out.println("Map.Entry의 갯수는" + map1.size());
	    
	    System.out.println(map1.get(3));
	    Member m1 = new Member("2000", "홍길동");
	    Member m2 = new Member("2020", "이순신");
	    Member m3 = new Member("2022", "최수진");
	    Map<String, String> map2 = new HashMap<String, String>();
	    
	    map2.put(m1.getSno(), m1.getName());
	    map2.put(m2.getSno(), m2.getName());
	    map2.put(m3.getSno(), m3.getName());
	    
	    System.out.println(m1.getSno() + "학번의 사람의 이름은" + map2.get(m1.getSno()));
	    System.out.println(m2.getSno() + "학번의 사람의 이름은" + map2.get(m2.getSno()));
	    System.out.println(m3.getSno() + "학번의 사람의 이름은" + map2.get(m3.getSno()));
	    
	    
	    
	    System.out.println("map1.get(5)은?" +map1.get(5));
	    if(map1.get(5) == null) {
	    	System.out.println("없는키입니다");
	    }
	    System.out.println();
	    
	    Set ks = map1.keySet();
	    Iterator<Integer> it1 = ks.iterator();
	    while(it1.hasNext()) {
	    	System.out.println(it1.next());
//	    	Integer key = it1.next();
//	    	String value = map1.get(key);
//	    	System.out.println(key + " " + value);
	    }
	    
	    //map2도 key를 모두 가져오기
	    
	    Set ks1 = map2.keySet();
	    Iterator<String> it2 = ks1.iterator();
	    while(it2.hasNext()) {
	    	System.out.println(it2.next());
	    }
	}

}

class Member{
	String sno;
	String name;
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Member(String sno, String name) {
		super();
		this.sno=sno;
		this.name=name;
		
		// TODO Auto-generated constructor stub
	}
	
}
