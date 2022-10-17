package ch10;

public class Anonymous {
	
	Parent pp = new Parent() {
		//익명 자식클래스
		int cc = 100;
		void method() {
			System.out.println("익명 자식객체 부분" + cc);
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
