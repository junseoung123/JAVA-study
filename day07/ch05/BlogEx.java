package ch05;

import java.util.Scanner;

public class BlogEx {

	public static void main(String[] args) {
		/* 1. 2+3-4 = 1 2 + 3 * 4 =14 2 * 3 / 4 = 1.5
       int a1=2, b1=3, c1=4;
       System.out.println(a1 + " + " + b1 + " - " + c1 + " = " + a1+b1-c1);
       System.out.println(a1 + " + " + b1 + " * " + c1 + " = " + a1+b1*c1);
       System.out.println(a1 + " * " + b1 + " / " + c1 + " = " + a1+b1/c1);
	   System.out.println(c1 + " / " + b1 + " ���� " + (c1/bq ));
	   System.out.println(c1 + " / " + b1 + " �������� " + (c1%bq ));*/
	
		/*Scanner sc = new Scanner(System.in);
		System.out.println("����1�� �Է�");
		int number1 = sc.nextInt();
		
		System.out.println("�ι�° ����1�� �Է�");
		int number2 = sc.nextInt();
		
		//��Ģ�����ؼ� ����ϱ�
		System.out.println("����" + (number1 + number2));
		System.out.println("����" + (number1 - number2));
		System.out.println("����" + (number1 * number2));
		System.out.println("������" + (number1 / number2));
		System.out.println("������" + (number1 % number2));*/
		
		System.out.println("������ȯ ���α׷�");
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȯ�� ���� ?");
		int money = sc.nextInt(); // 777
		
		int m500 = money / 500; //1
		money = money - 500*m500; // 277
		
		int m100 = money / 100; //2
        money = money - 100*m100; //277 -100*2
		
		int m50 = money / 50; //77 /50 =1
		money = money - 50*m50; // 77 - 50*1 =27
		
		int m10 = money / 10;
		money = money - 10*m10; //7
		
		System.out.println("500��¥�� ==>" + m500);
		System.out.println("100��¥�� ==>" + m100);
		System.out.println("50��¥�� ==>" + m50);
		System.out.println("10��¥�� ==>" + m10);
		System.out.println("�ٲ������ѵ� ==>" + money);
		
	}

}
