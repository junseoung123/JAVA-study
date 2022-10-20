package ch02;

import java.util.*;

public class SetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Customer> set1 = new LinkedHashSet<Customer>();
		
		Customer c1= new Customer("1234","c12","È«±æµ¿");
		Customer c2 = new Customer("1235","c12","ÀÌ¼ø½Å");
		Customer c3 = new Customer("1234","c12","È«±æµ¿");
		Customer c4 = new Customer("1234","c12","È«±æµ¿");
		Customer c5 = new Customer("1234","c12","È«±æµ¿");
		set1.add( c1);
		set1.add(c2);
		set1.add( c3);
		set1.add( c4);
		set1.add( c5);
		
		set1.remove(c1);
		System.out.println(set1.size());
		

	}

}

class Customer {
	String phone;
	String cno;
	String name;
	
	@Override
	public int hashCode() {
		
		return phone.hashCode() + cno.hashCode() + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			Customer c = (Customer) obj;
			if(phone.equals(c.phone) && cno.equals(c.cno) && name.equals(c.name)) return true;
			
		}
		return false;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(String phone, String cno, String name) {
		super();
		this.phone = phone;
		this.cno = cno;
		this.name = name;
	}
}