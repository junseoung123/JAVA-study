package ch02;

public class EnumWeekEx {

	public static void main(String[] args) {
		// ������ ������ ����
		
		Week today;
		
		today = Week.MONDAY;
		
		String nn = today.name();
		System.out.println(nn);
		
		int ord = today.ordinal();
		System.out.println( "�������� ���ŵ� ����" + ord + 1 );
		
		Week[] wa = today.values(); {
			for(int i=0; i<wa.length; i++) {
				System.out.print( wa[i] + " ");
			}
			today.valueOf("MONDAY"); //���ڿ��� "MONDAY"�� ���������� ��Ÿ��
		
		
		}
				

	}

}
