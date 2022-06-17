package ch02;

import java.util.Scanner;

public class InheriEx02 {

	public static void main(String[] args) {
		
		Marine marine = new Marine();
		Scanner sc = new Scanner(System.in);
		System.out.println("보병의 위치 :");
		int x = sc.nextInt(); //10
		int y = sc.nextInt(); //20
		
		marine.x = x;
		marine.y = y;
		marine.move(x, y);
		System.out.println("보병");
		marine.stop();
		marine.stimpack();
		
		//탱크
		Tank tank = new Tank();
		System.out.println("탱크의 위치");
		x = sc.nextInt(); //100
		y = sc.nextInt(); //200
		tank.x =x;
		tank.y =y;
		tank.move(x,y);
		System.out.println("탱크의");
		tank.stop();
		tank.changeMode();
		
		//수송선
	    Dropship dropship = new Dropship();
		System.out.println("수송선의 위치");
		x = sc.nextInt(); //100
		y = sc.nextInt(); //200
		dropship.move(x,y);
		System.out.println("수송선의");
		dropship.stop();
		dropship.load(marine.x+10,marine.y-10);
		dropship.upload(tank.x-50, tank.y+50);
		
		



	}

}
