package ch13;

public class ExceptionEx01 {
   
	public static void main(String[] args) {
		try {
		String data = "AA";
		System.out.println(data.toString());
		int[] a = new int[3];
		a[5] =100;
		int k = 10/0;
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("배열첨자부분오류 수행");
		e.printStackTrace( );
	} catch (NullPointerException e1) {
		System.out.println("nullpointer에서 예외 발생");
		System.out.println(e1.getMessage());
	} catch (ArithmeticException e2) {
		System.out.println("산술적 계산부분 예외 발생");
		System.out.println(e2.getMessage());
	}catch(Exception e) {
		System.out.println("모든예외 다 나오는곳");
	}
		finally {
	System.out.println("이곳에 자료 출력되나요?");
    System.out.println("에외와 상관없이 반드시 처리되는 부분");
	}
	}

}
