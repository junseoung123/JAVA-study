package ch03;

public class InherEx03 {

	public static void main(String[] args) {
		// ����� ����
		// ����� �θ� �ڽ����� Ŭ������ ���踦 �δ� �͟� ���Ѵ�.
		// ������(����ȭ)�� ����(�θ�)�̴� ����̴� �����̴� is~a����
		
		//�ڵ����� �ڵ� �������ִ� ������ �������ִ� has~a���� ���� import �����
		
		//������ - �����ϴ°� new
		//���հ��� import has~a ������ �ڵ����̴� X
		//��Ӱ��� extends is~a �ڽ�Ŭ������ ���Ŭ�����̴� �������� �����̴�
		
		//����ϱ�
		//A a = new A();
		//AA aa = new AA();
		AAA aaa= new AAA();
		
		System.out.println(aaa.aaafield);
		System.out.println(aaa.aafield);
		System.out.println(aaa.afield);
		System.out.println("---------");
		
		AB ab = new AB();
		System.out.println(ab.abfield);
		System.out.println(ab.afield);
		
		System.out.println("============");
		AA aa1 = new AA(1000);
		System.out.println("aa1.aafield ==>" + aa1.aafield);
		System.out.println("aa1.afield ==>" + aa1.afield);
		
		System.out.println("============");
		AA aa2 = new AA(2000, 5000);
		System.out.println("aa1.aafield ==>" + aa2.aafield);
		System.out.println("aa1.afield ==>" + aa2.afield);
		
		System.out.println("============");
		AAA aaa1 = new AAA(0, 1, 2);
		System.out.println("aa1.aaafield ==>" + aaa1.aaafield);
		System.out.println("aa1.aafield ==>" + aaa1.aafield);
		System.out.println("aa1.afield ==>" + aaa1.afield);
		
		

	}

}
