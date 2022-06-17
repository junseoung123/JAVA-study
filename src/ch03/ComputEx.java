package ch03;

public class ComputEx {
	public static void main(String[] args) {
		
		int r=10;
		//부모 클래스 객체생성
		Calculator calculator = new Calculator();
		System.out.println(calculator.areaCircle(r));
		//자식클래스 객체 생성
		Compute compute = new Compute();
		System.out.println(compute.areaCircle(r));
		
		System.out.println();
		
		System.out.println("----toString()를 재정의한 부분 -------");
		System.out.println(calculator.toString());
		System.out.println(calculator);
		
		System.out.println("---hashcode()재정의 부분------");
		System.out.println(calculator.hashCode());
		
		
		
	}

}
