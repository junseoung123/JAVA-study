package ch09;

public class ChildEx {

	public static void main(String[] args) {
		// ������ ��ü����
		Parent p1 = new Child();
		
		//Child c1 = new Parent(); X
		//p1 ���������� ����ų���̾������� ��¾Ŭ����? Parent
		//p1.field = "aaa";
		//p1.method();
		//p1.method2();
		
		//down casting�ϸ� �ڽ�Ŭ�������մ� �ʵ�� �޼ҵ� ����ġ�� ����
		Child c1 = (Child)p1;
		c1.field2="bbb";
		c1.method3();
		
		//�����ϸ� ��������  Parent() ��ü�����ϸ� �ڱ⸸ ���޸𸮿� �ö󰣴�.
		Parent p2 = new Parent();
		Child c2 = (Child) p2;
		c2.field2 ="ddd";
		c2.method3();
		

	}

}
