package ch02;

import java.util.Scanner;

public class InheriEx02 {

	public static void main(String[] args) {
		
		Marine marine = new Marine();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��ġ :");
		int x = sc.nextInt(); //10
		int y = sc.nextInt(); //20
		
		marine.x = x;
		marine.y = y;
		marine.move(x, y);
		System.out.println("����");
		marine.stop();
		marine.stimpack();
		
		//��ũ
		Tank tank = new Tank();
		System.out.println("��ũ�� ��ġ");
		x = sc.nextInt(); //100
		y = sc.nextInt(); //200
		tank.x =x;
		tank.y =y;
		tank.move(x,y);
		System.out.println("��ũ��");
		tank.stop();
		tank.changeMode();
		
		//���ۼ�
	    Dropship dropship = new Dropship();
		System.out.println("���ۼ��� ��ġ");
		x = sc.nextInt(); //100
		y = sc.nextInt(); //200
		dropship.move(x,y);
		System.out.println("���ۼ���");
		dropship.stop();
		dropship.load(marine.x+10,marine.y-10);
		dropship.upload(tank.x-50, tank.y+50);
		
		



	}

}
