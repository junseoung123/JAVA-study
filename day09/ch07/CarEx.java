package ch07;

import java.util.Scanner;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		int breakSelect=0;
		int tireKindSelect=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ڵ����� ��ũ �����ϴ�");
		System.out.println("1.�� ���� 2.�� ������ 3.�� ���� 4.�� ������ ");
		breakSelect = sc.nextInt();
		System.out.println("���Ÿ�̾�� ��ü�Ͻðٽ��ϱ�");
		System.out.println("1.�ѱ�Ÿ�̾� 2.��ȣŸ�̾�");
		tireKindSelect = sc.nextInt();
		
		switch(breakSelect) {
		case 1: if(tireKindSelect==1) {
			myCar.frontLeftTire = new HankookTire();break;
		} else {
		myCar.frontLeftTire = new KumhoTire(); break;
		}
		case 2: if(tireKindSelect==1) {
			myCar.frontRightTire = new HankookTire();break;
		} else {
		myCar.frontRightTire = new KumhoTire(); break;
		}
		case 3: if(tireKindSelect==1) {
			myCar.backLeftTire = new HankookTire(); break;
		} else {
			myCar.backLeftTire = new KumhoTire(); break;
		}
		case 4: if(tireKindSelect==1) {
			myCar.backRightTire = new HankookTire(); break;
		} else {
			myCar.backRightTire = new KumhoTire(); break;
		}
		}
		myCar.run();

	}

}
