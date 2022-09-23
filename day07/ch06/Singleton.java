package ch06;

public class Singleton {
	private static Singleton   singleton = new Singleton();
	
	private Singleton() {
		//생성자를 외부에서 접근하지 못하게 private
	}
	
	static Singleton getInstance() {
		return singleton;
	}

}
