package cafe1331Ex;

import java.util.Scanner;

public class Business {
	
	SeoulJisa sj = new SeoulJisa();
	KyunginJisa kj = new KyunginJisa();
	KangwonJisa kwj = new KangwonJisa();
	GejuJisa gj = new GejuJisa();
	Scanner sc = new Scanner(System.in);
	String yn = "y";

	 void input() {
		 while( yn.equals("y")) {
		//  �Է¹ޱ�
		 System.out.println("�����?");
		 System.out.println("1.�������� 2.�������� 3.�������� 4.��������");
		 System.out.println("������?");
		 
		 
		 int jisaSelect = sc.nextInt();
		 
		 if(jisaSelect ==1) 
			 jisaInput(sj);
			  else if (jisaSelect == 2) jisaInput(kj);
			  else if (jisaSelect == 3) jisaInput(kwj);
			 else if (jisaSelect == 4)  jisaInput(gj);
			 else System.out.println("�����ȣ�� 1~4�Դϴ� �ٽ��Է��ϱ�");
	 }
	 }
	 
	 void output() {
		//if(sj.productName.equals(("computer"));
		 System.out.println("  " + sj.jisaName + " " + sj.productName + "2000000" + sj.salesAmount + " " + sj.salesStatus);
	 }

	void jisaInput(Jisa jisa) {
		
		System.out.println("��ǰ��?");
		if(jisa instanceof SeoulJisa) {
			sj = (SeoulJisa) jisa;
			sj.productName=sc.next();
			System.out.println(sj + sj.productName + "�Ǹŷ���?");
			sj.salesAmount = sc.nextInt();
		//	saleStatus(sj);
		}else if(jisa instanceof KyunginJisa) {
			kj = (KyunginJisa) jisa;
			kj.productName =sc.next();
			System.out.println(kj + kj.productName + "�Ǹŷ���?");
			kj.salesAmount = sc.nextInt();
			//saleStatus(kj);
		}else if(jisa instanceof KangwonJisa) {
			kwj = (KangwonJisa) jisa;
			kwj.productName = sc.next();
			System.out.println(kwj + kwj.productName + "�Ǹŷ���?");
			kwj.salesAmount = sc.nextInt();
		//	saleStatus(kwj);
		}else if(jisa instanceof GejuJisa) {
			gj = (GejuJisa) jisa;
			gj.productName = sc.next();
			System.out.println(gj + gj.productName + "�Ǹŷ���?");
			gj.salesAmount = sc.nextInt();
		//	saleStatus(gj);
		}
		System.out.println();
		System.out.println("��� �Է��Ͻðڽ��ϱ�? (y/n)");
		yn = sc.next();
		
		
	}
	
	void salesStatus(Jisa jisa) {
		if(jisa instanceof SeoulJisa) {
			if(sj.productName.equals("computer")) {
				 sj.salesStatus = sj.salesAmount*2000000;
				
			} else if(sj.productName.equals("print")) {
				sj.salesStatus = sj.salesAmount*500000;
				
			}
		}else if(jisa instanceof KyunginJisa) {
			 kj.salesStatus = kj.salesAmount*2000000;
				
		} else if(sj.productName.equals("print")) {
			kj.salesStatus = kj.salesAmount*500000;
			
		}else if(jisa instanceof KangwonJisa) {
			 kwj.salesStatus = kwj.salesAmount*2000000;
				
		} else if(sj.productName.equals("print")) {
			kwj.salesStatus = kwj.salesAmount*500000;
			
		}else if(jisa instanceof GejuJisa) {
			 gj.salesStatus = gj.salesAmount*2000000;
				
		} else if(sj.productName.equals("print")) {
			gj.salesStatus = gj.salesAmount*500000;
			
		}
	}

	
		
	}
	 
	 


