package ch08;

import java.util.*;

public class TreeMapEx08 {

	public static void main(String[] args) {

       TreeMap<Member, String> tm= new TreeMap<Member, String>();
       
       Member m1 = new Member("È«±æµ¿1", "123", 100);
       Member m2 = new Member("È«±æµ¿2", "124", 80);
       Member m3 = new Member("È«±æµ¿3", "125", 90);
       Member m4 = new Member("È«±æµ¿4", "126", 50);
       
       //Å°-¹øÈ£  ¹ë·ù-ÀÌ¸§ È¸ºñ
       tm.put(m1, m1.getNamePay());
       tm.put(m2, m1.getNamePay());
       tm.put(m3, m1.getNamePay());
       tm.put(m4, m1.getNamePay());
       
       Map.Entry<Member, String> entry =null;
       entry = tm.firstEntry();
       System.out.println(entry.getKey().getPhone() + " " + entry.getValue());
       
       entry = tm.lastEntry();
       System.out.println(entry.getKey().getPhone() + " " + entry.getValue());

	}

}

class Member //implements Comparable<Member>
{
	String name;
	String phone;
	int pay;
	
//	@Override
//	public int compareTo(Member o) {
//		
//		return phone.compareTo(o.phone);
//	}
	
	public String getNamePay() {
		return name + " " + pay;
	}
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Member(String name, String phone, int pay) {
		super();
		this.name = name;
		this.phone = phone;
		this.pay = pay;
	}
	
}