package ch06;

public class Singleton {
	private static Singleton   singleton = new Singleton();
	
	private Singleton() {
		//�����ڸ� �ܺο��� �������� ���ϰ� private
	}
	
	static Singleton getInstance() {
		return singleton;
	}

}
