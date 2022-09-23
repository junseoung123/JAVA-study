package ch08;

public class Cylinder {
	
	Circle circle;
	double height;
	double getVolume(Circle c) {
		// 부피 = 널비 * 높이
		return c.getArea() * height;
	}
	double getVolume() {
		return circle.getArea()*height;
	}
	public Cylinder (Circle c1, double height) {
		this.circle = c1;
		this.height = height;
		
	}
	public Cylinder() {
		// 기본생성자는 명시적 생성자를 피로그래머가 만들어주면 컴파일러가 안만들어준다
	}
	public static void main(String[] args) {
		Circle c = new Circle(2.8);
		Cylinder cy = new Cylinder();
		cy.height = 5.6;
		cy.circle = c;
		System.out.println("부피 =>" + cy.getVolume(c));
		
		Cylinder cd = new Cylinder(new Circle(1.5), 6.3);
		System.out.println("부피2 =>" + cd.getVolume());
	}

}
