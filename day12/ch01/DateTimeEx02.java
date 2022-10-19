package ch01;

import java.util.Calendar;
import java.util.Date;

public class DateTimeEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		System.out.println(now);
		
		Calendar now1 = Calendar.getInstance();
		int year = now1.get(Calendar.YEAR);
		int month = now1.get(Calendar.MONTH);
		System.out.println(year + "³â" + (month+1) + "¿ù");
}

}
