package ch10;

public class Anonymous {
	
	Parent pp = new Parent() {
		//�͸� �ڽ�Ŭ����
		int cc = 100;
		void method() {
			System.out.println("�͸� �ڽİ�ü �κ�" + cc);
		}
		@Override
		void pmethod() {
			// TODO Auto-generated method stub
			method();
		}
		
	};
	
	void amethod() {
		pp.pmethod();
	}

}
