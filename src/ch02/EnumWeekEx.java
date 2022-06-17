package ch02;

public class EnumWeekEx {

	public static void main(String[] args) {
		// 열거형 일주일 예제
		
		Week today;
		
		today = Week.MONDAY;
		
		String nn = today.name();
		System.out.println(nn);
		
		int ord = today.ordinal();
		System.out.println( "열거형에 열거된 순서" + ord + 1 );
		
		Week[] wa = today.values(); {
			for(int i=0; i<wa.length; i++) {
				System.out.print( wa[i] + " ");
			}
			today.valueOf("MONDAY"); //문자열일 "MONDAY"가 열거형으로 나타남
		
		
		}
				

	}

}
