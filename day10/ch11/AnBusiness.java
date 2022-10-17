package ch11;

public class AnBusiness {
	//ÀÍ¸í ÀÚ½ÄÅ¬·¡½º ¸¸µé±â
	
	Animal ani = new Animal() {
		void sound() {
			System.out.println("¸Û¸Û");
		};
	};
	
	void play() {
		ani.sound();
	}
	
	void m() {
		Animal ani = new Animal() {
			@Override
			void sound() {
				System.out.println("À½¸Þ");
			}
		};
		ani.sound();
	}
	
	void p() {
		Animal ani = new Animal() {
			@Override
			void sound() {
				System.out.println("²Ü²Ü");
			}
		};
	}

}
