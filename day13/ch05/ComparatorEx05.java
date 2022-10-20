package ch05;

import java.util.*;

public class ComparatorEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Fruit> ts = new TreeSet<Fruit>(new FruitComparator());
		
		//객체 생성하기
		Fruit f1 = new Fruit("포도", 3000);
		Fruit f2 = new Fruit("수박", 10000);
		Fruit f3 = new Fruit("딸기", 6000);
		Fruit f4 = new Fruit("바나나", 5000);
		
		ts.add(f1);
		ts.add(f2);
		ts.add(f3);
		ts.add(f4);
		
		Iterator<Fruit> itts=ts.iterator();
		while(itts.hasNext()) {
			System.out.println(itts.next());
		}
		//가격 순서대로 출력하기
		
		//가격 역순으로 출력하기
	    Iterator<Fruit> itdts = ts.descendingIterator();
	    while(itdts.hasNext()) {
	    	System.out.println(itdts.next());
	    }
	    
	    
	    NavigableSet<Fruit>  s = ts.headSet(f4, true);
	    for(Fruit ss : s) {
	    	System.out.println(ss.getName());
	    }

	}

}

class FruitComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		//if(o1.name.compareTo(o2.name)<0) return -1;
		//else if(o1.name.compareTo(o2.name)==0) return 0;
		//else return 1;
		return o1.price-o2.price;
	}
}

class Fruit //implements Comparable<Fruit>
     {
	String name;
	int price;
	
	/*@Override
	public int compareTo(Fruit o) {
		if(name.compareTo(o.name)<0) return -1;
		else if(name.compareTo(o.name)==0) return 0;
		return 1;
     }*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}
