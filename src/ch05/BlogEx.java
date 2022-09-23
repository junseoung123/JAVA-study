package ch05;

import java.util.Scanner;

public class BlogEx {

	public static void main(String[] args) {
		/* 1. 2+3-4 = 1 2 + 3 * 4 =14 2 * 3 / 4 = 1.5
       int a1=2, b1=3, c1=4;
       System.out.println(a1 + " + " + b1 + " - " + c1 + " = " + a1+b1-c1);
       System.out.println(a1 + " + " + b1 + " * " + c1 + " = " + a1+b1*c1);
       System.out.println(a1 + " * " + b1 + " / " + c1 + " = " + a1+b1/c1);
	   System.out.println(c1 + " / " + b1 + " 몫은 " + (c1/bq ));
	   System.out.println(c1 + " / " + b1 + " 나머지는 " + (c1%bq ));*/
	
		/*Scanner sc = new Scanner(System.in);
		System.out.println("숫자1개 입력");
		int number1 = sc.nextInt();
		
		System.out.println("두번째 숫자1개 입력");
		int number2 = sc.nextInt();
		
		//사칙연산해서 출력하기
		System.out.println("덧셈" + (number1 + number2));
		System.out.println("뺄셈" + (number1 - number2));
		System.out.println("곱셈" + (number1 * number2));
		System.out.println("나눗셈" + (number1 / number2));
		System.out.println("나머지" + (number1 % number2));*/
		
		System.out.println("동전교환 프로그램");
		Scanner sc = new Scanner(System.in);
		System.out.println("교환할 돈은 ?");
		int money = sc.nextInt(); // 777
		
		int m500 = money / 500; //1
		money = money - 500*m500; // 277
		
		int m100 = money / 100; //2
        money = money - 100*m100; //277 -100*2
		
		int m50 = money / 50; //77 /50 =1
		money = money - 50*m50; // 77 - 50*1 =27
		
		int m10 = money / 10;
		money = money - 10*m10; //7
		
		System.out.println("500원짜리 ==>" + m500);
		System.out.println("100원짜리 ==>" + m100);
		System.out.println("50원짜리 ==>" + m50);
		System.out.println("10원짜리 ==>" + m10);
		System.out.println("바꾸지못한돗 ==>" + money);
		
	}

}
