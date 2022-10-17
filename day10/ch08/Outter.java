package ch08;

public class Outter {
	String field = "Outter-field";
	
	void method() {
		System.out.println("Outter-method");
	}
	
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println();
		}
		void print() {
			System.out.println(this.field);
		}
	}

}
