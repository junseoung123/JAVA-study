package ch03;

public class StringRefEx {
       //참조
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "이순신";
		String name3 = "홍길동";
		
		System.out.println( name1 == name2);
		System.out.println( name1 == name3);
		
		String name4 = new String("정현희");
		String name5 = new String("이경미");
		String name6 = new String("정현희");
		
		System.out.println( name4 == name5);
		System.out.println( name4 == name6);
		
		//String 변수가 가지고있는 주소값으로 비교하기
		System.out.println(name4.equals(name5));
		System.out.println(name4.equals(name6));
		

	}

}
