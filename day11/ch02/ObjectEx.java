package ch02;

public class ObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println("�ʿ��� 10�� ������ �Ǵ��ϱ�");
		if(a.equals(10))
			System.out.println("����");
		else
			System.out.println("�ٸ���");

	}

}

class A {
	String pay1="�ʿ�";
	int pay2=10;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(pay1.equals("�ʿ�") && pay2==10) {
			return true;
		} else {
			return false;
		}
		//return super.equals(obj);
	}@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
}




