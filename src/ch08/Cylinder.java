package ch08;

public class Cylinder {
	
	Circle circle;
	double height;
	double getVolume(Circle c) {
		// ���� = �κ� * ����
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
		// �⺻�����ڴ� ����� �����ڸ� �Ƿα׷��Ӱ� ������ָ� �����Ϸ��� �ȸ�����ش�
	}
	public static void main(String[] args) {
		Circle c = new Circle(2.8);
		Cylinder cy = new Cylinder();
		cy.height = 5.6;
		cy.circle = c;
		System.out.println("���� =>" + cy.getVolume(c));
		
		Cylinder cd = new Cylinder(new Circle(1.5), 6.3);
		System.out.println("����2 =>" + cd.getVolume());
	}

}
