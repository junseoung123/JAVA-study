package ch07;

public class kumhoTire extends Tire{

	public kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// 부모생성자의 동일한 타입을 자식생성자를 만들어서 부모생성자를 호출해야함
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "kumhoTire 수명 :" + (maxRotation - accumulatedRotation) + "회");
		return true;
		}else {
			System.out.println("***" + location + "kumhoTire펑크 ***");
			return false;
		}
	}
}
