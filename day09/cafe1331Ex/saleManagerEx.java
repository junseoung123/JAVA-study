package cafe1331Ex;

import java.util.Scanner;

public class saleManagerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menuSelect=0;
		Business b= new Business();
		while(menuSelect !=3) {
			System.out.println("---------------------");
			System.out.println("     �Ǹŷ� ���� ������Ʈ    ");
			System.out.println("---------------------");
			System.out.println("1.�Է� 2.��� 3. ����");
			System.out.println("������?");
			menuSelect = sc.nextInt();
		   switch(menuSelect) {
		     case 1: b.input(); break;
		     case 2: b.output(); break;
		     case 3: break;
		     default : System.out.println("1~3������ ���ڸ� �Է��ϼ���");
		
		}
		
		}

	}

}
