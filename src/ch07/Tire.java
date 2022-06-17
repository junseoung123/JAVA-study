package ch07;

public class Tire {
	//필드 314
	public int maxRotation;//최대회전수
	public int accumulatedRotation;//누적회전수
	public String location;//타이어의 위치
	
	//부모의 명시적 생성자
	//부모의 명시적 생성자를 프로그래머가 만들어주면 기본생성자는 컴파일러가 만들지 않는다
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 :" + (maxRotation - accumulatedRotation) + "회");
		return false;
		}else {
			System.out.println("***" + location + "Tire펑크 ***");
			return false;
		}
	}

}
