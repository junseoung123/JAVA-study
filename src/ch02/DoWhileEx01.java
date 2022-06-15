package ch02;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		// dowhile문
	    // do{반복할 문장} while (조건문)
		//1~10까지 출력하기
		int a=0;
		do {
            a++;
            System.out.print(a+ " ");
	  }while( a< 10);
		//20~0까지 출력하기
		
		System.out.println();
		a = 20;
		do {
			a--;
			System.out.print(a + " ");
		} while (a > 0);
		System.out.println();
		a=100;
		do {
			if( a%15 == 0) {
				System.out.println();
			}
			System.out.print(a + " ");
			a++;
	}while(a<=300);
		System.out.println();
		int b =10;
		do {
			System.out.println(b + "dowhile~");
			
}while(b <= 0);
		
		System.out.println();
		while(b<=0) {
			System.out.println(b + "while~~");
		}
		// 웹사이트를 종료하실래요? y/n
		
		Scanner sc = new Scanner(System.in); //키보드 입력 클래스 생성
		
		do {
			System.out.println("웹사이트 실행하는 프로그램");
			System.out.println("웹사이트를 종료하시겟습니까?==>(y or n)");//y/n화면 띄우기
			String yn = sc.next();
			yn = yn.toUpperCase();
			if(yn.equals("Y")) {
				break;
			}
			
			
}while(true);
		System.out.println();
		
		int choice =0; //선택변수
		int deposit =0; //예금액 변수
		int withdraw =0; //출금액
		int balance =0; //잔고 변수
		Scanner ac = new Scanner(System.in);
		boolean flag = true;
		
		
		do {
			System.out.println("--------------------------");
			System.out.println("1.예금 |2. 출금|3. 잔고|4.종료");
			System.out.println("--------------------------");
			System.out.println("선택>");
			choice = ac.nextInt();
			switch( choice ) {
			case 1: System.out.println("예금액 > ");
		              deposit = ac.nextInt(); 
		              balance = balance + deposit; 
		              break;
			case 2: System.out.println("출금액 > ");
			          withdraw = sc.nextInt(); 
			          if(balance < 0) {
                         System.out.println("잔액이 부족합니다. 출금이안돼요");
			          } else {
			          balance = balance - withdraw;
			          }
			          break;
			case 3: System.out.println("잔액> " + balance);
			          break;
			case 4: System.out.println("프로그램 종료");
				flag = false; 
				break;
			}
			
			
			
}while( flag );
}	
}