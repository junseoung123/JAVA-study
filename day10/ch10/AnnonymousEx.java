package ch10;

public class AnnonymousEx {

	public static void main(String[] args) {
		Child c = new Child();
		c.pmethod();
		c.cmethod();
		
		System.out.println("==다형성이용==");
		Parent p = new Child();
		p.pmethod();
		c=(Child)p;
		c.cmethod();

	}

}
