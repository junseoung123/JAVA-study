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
		System.out.println("�迭÷�ںκп��� ����");
		e.printStackTrace( );
	} catch (NullPointerException e1) {
		System.out.println("nullpointer���� ���� �߻�");
		System.out.println(e1.getMessage());
	} catch (ArithmeticException e2) {
		System.out.println("����� ���κ� ���� �߻�");
		System.out.println(e2.getMessage());
	}catch(Exception e) {
		System.out.println("��翹�� �� �����°�");
	}
		finally {
	System.out.println("�̰��� �ڷ� ��µǳ���?");
    System.out.println("���ܿ� ������� �ݵ�� ó���Ǵ� �κ�");
	}
	}

}
