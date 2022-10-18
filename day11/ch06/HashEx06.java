package ch06;

import java.util.Objects;

public class HashEx06 {

	public static void main(String[] args) {


		//Student s1 = new Student(2022, "È«±æµ¿");
		//System.out.println(s1.hashCode());
		//System.out.println(Objects.hash(s1.sno + s1.name.hashCode()));
		
		long time = System.currentTimeMillis();
		System.out.println(time/(60*60*1000) + "½Ã");
		
	    System.out.println(System.getProperty("java.version"));
	    System.out.println(System.getProperty("os.name"));
	    System.out.println(System.getProperty("user.name"));
	    System.out.println(System.getProperty("user.home"));
	    
//	   Properties props =  System.getProperties();
//	   Set keys = props.keySet();
//	   for( Object objkey : keys) {
//		   String key = (String) objKey;
//		   String value = System.getProperty(key);
//		   System.out.println("key :" + key + "value :" + value);
//	   }
//
//	}

}

class Student{
	int sno;
	String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno +  name.hashCode();
	}
}
}