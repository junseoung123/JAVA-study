package ch11;

public class AnnonymousEx {

	public static void main(String[] args) {
		Animal animal=new Cat();
		animal.sound();
		
		Animal ani1 = new Animal();
		ani1.sound();
		
		AnBusiness ab = new AnBusiness();
		ab.play();

	}

}
