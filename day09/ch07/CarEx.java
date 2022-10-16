package ch07;

import java.util.Scanner;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();
		int breakSelect=0;
		int tireKindSelect=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자동차가 펑크 났습니다");
		System.out.println("1.앞 왼쪽 2.앞 오른쪽 3.뒤 왼쪽 4.뒤 오른쪽 ");
		breakSelect = sc.nextInt();
		System.out.println("어느타이어로 교체하시겟습니까");
		System.out.println("1.한국타이어 2.금호타이어");
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
