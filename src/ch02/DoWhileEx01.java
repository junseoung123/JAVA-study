package ch02;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		// dowhile��
	    // do{�ݺ��� ����} while (���ǹ�)
		//1~10���� ����ϱ�
		int a=0;
		do {
            a++;
            System.out.print(a+ " ");
	  }while( a< 10);
		//20~0���� ����ϱ�
		
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
		// ������Ʈ�� �����ϽǷ���? y/n
		
		Scanner sc = new Scanner(System.in); //Ű���� �Է� Ŭ���� ����
		
		do {
			System.out.println("������Ʈ �����ϴ� ���α׷�");
			System.out.println("������Ʈ�� �����Ͻðٽ��ϱ�?==>(y or n)");//y/nȭ�� ����
			String yn = sc.next();
			yn = yn.toUpperCase();
			if(yn.equals("Y")) {
				break;
			}
			
			
}while(true);
		System.out.println();
		
		int choice =0; //���ú���
		int deposit =0; //���ݾ� ����
		int withdraw =0; //��ݾ�
		int balance =0; //�ܰ� ����
		Scanner ac = new Scanner(System.in);
		boolean flag = true;
		
		
		do {
			System.out.println("--------------------------");
			System.out.println("1.���� |2. ���|3. �ܰ�|4.����");
			System.out.println("--------------------------");
			System.out.println("����>");
			choice = ac.nextInt();
			switch( choice ) {
			case 1: System.out.println("���ݾ� > ");
		              deposit = ac.nextInt(); 
		              balance = balance + deposit; 
		              break;
			case 2: System.out.println("��ݾ� > ");
			          withdraw = sc.nextInt(); 
			          if(balance < 0) {
                         System.out.println("�ܾ��� �����մϴ�. ����̾ȵſ�");
			          } else {
			          balance = balance - withdraw;
			          }
			          break;
			case 3: System.out.println("�ܾ�> " + balance);
			          break;
			case 4: System.out.println("���α׷� ����");
				flag = false; 
				break;
			}
			
			
			
}while( flag );
}	
}