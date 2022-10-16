package cafe1331Ex;

import java.util.Scanner;

public class saleManagerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menuSelect=0;
		Business b= new Business();
		while(menuSelect !=3) {
			System.out.println("---------------------");
			System.out.println("     판매량 관리 프로잭트    ");
			System.out.println("---------------------");
			System.out.println("1.입력 2.출력 3. 종료");
			System.out.println("선택은?");
			menuSelect = sc.nextInt();
		   switch(menuSelect) {
		     case 1: b.input(); break;
		     case 2: b.output(); break;
		     case 3: break;
		     default : System.out.println("1~3사이의 숫자를 입력하세요");
		
		}
		
		}

	}

}
