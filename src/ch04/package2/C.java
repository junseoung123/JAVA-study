package ch04.package2;

import ch04.package1.B;

public class C {
	
	public void method() {
		//AŬ���� ��ü �����ϱ�
		//A a = new A(); //�ȉ� AŬ������ Ŭ������ �������� ���� �����ڴ� protected�̹Ƿ� �ٸ� ��Ű������ ��Ӱ�����
		
		B b = new B(); //���ٱ� ������ ���� bŬ������ ������ �޼ҵ�� ��� public ���� ����Ǿ��ֱ� ����
		
		b.method();
	}

}
