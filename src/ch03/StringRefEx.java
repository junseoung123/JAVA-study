package ch03;

public class StringRefEx {
       //����
	public static void main(String[] args) {
		String name1 = "ȫ�浿";
		String name2 = "�̼���";
		String name3 = "ȫ�浿";
		
		System.out.println( name1 == name2);
		System.out.println( name1 == name3);
		
		String name4 = new String("������");
		String name5 = new String("�̰��");
		String name6 = new String("������");
		
		System.out.println( name4 == name5);
		System.out.println( name4 == name6);
		
		//String ������ �������ִ� �ּҰ����� ���ϱ�
		System.out.println(name4.equals(name5));
		System.out.println(name4.equals(name6));
		

	}

}
