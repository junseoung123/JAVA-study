package ch11;

public class AnBusiness {
	//�͸� �ڽ�Ŭ���� �����
	
	Animal ani = new Animal() {
		void sound() {
			System.out.println("�۸�");
		};
	};
	
	void play() {
		ani.sound();
	}
	
	void m() {
		Animal ani = new Animal() {
			@Override
			void sound() {
				System.out.println("����");
			}
		};
		ani.sound();
	}
	
	void p() {
		Animal ani = new Animal() {
			@Override
			void sound() {
				System.out.println("�ܲ�");
			}
		};
	}

}
