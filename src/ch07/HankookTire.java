package ch07;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	//클래스의 생성자를 쓰지않으면 기본생성자를 컴파일러 자동으로 만들어준다
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 :" + (maxRotation - accumulatedRotation) + "회");
		return true;
		}else {
			System.out.println("***" + location + "HankookTire펑크 ***");
			return false;
		}
		
	}
	
	
}
