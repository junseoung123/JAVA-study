package ch12;

public class Business {
	void busMethod() {
		Inter01 i01 = new Inter01(){
			@Override
			public void run() {
				System.out.println("������ �޸��ϴ�");
				
			}
			
		};
		i01.run();
	}
	void bycicleMethod() {
		Inter01 i02 = new Inter01() {
			 @Override
			public void run() {
				System.out.println("�����Ű��޸��ϴ�");
			}
		};
		i02.run();
	}
	void personMethod() {
		Inter01 i03 = new Inter01() {
			
			@Override
			public void run() {
				System.out.println("����̴޸��ϴ�");
			}
		};
		i03.run();
	}
	void carMethod() {
		Inter01 i04 = new Inter01() {
			
			@Override
			public void run() {
				System.out.println("�ڵ����� �޸��ϴ�");
			}
		};
		i04.run();
	}

}
