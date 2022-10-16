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
		//  입력받기
		 System.out.println("지사는?");
		 System.out.println("1.서울지사 2.경인지사 3.강원지사 4.제주지사");
		 System.out.println("선택은?");
		 
		 
		 int jisaSelect = sc.nextInt();
		 
		 if(jisaSelect ==1) 
			 jisaInput(sj);
			  else if (jisaSelect == 2) jisaInput(kj);
			  else if (jisaSelect == 3) jisaInput(kwj);
			 else if (jisaSelect == 4)  jisaInput(gj);
			 else System.out.println("지사번호는 1~4입니다 다시입력하기");
	 }
	 }
	 
	 void output() {
		//if(sj.productName.equals(("computer"));
		 System.out.println("  " + sj.jisaName + " " + sj.productName + "2000000" + sj.salesAmount + " " + sj.salesStatus);
	 }

	void jisaInput(Jisa jisa) {
		
		System.out.println("제품은?");
		if(jisa instanceof SeoulJisa) {
			sj = (SeoulJisa) jisa;
			sj.productName=sc.next();
			System.out.println(sj + sj.productName + "판매량은?");
			sj.salesAmount = sc.nextInt();
		//	saleStatus(sj);
		}else if(jisa instanceof KyunginJisa) {
			kj = (KyunginJisa) jisa;
			kj.productName =sc.next();
			System.out.println(kj + kj.productName + "판매량은?");
			kj.salesAmount = sc.nextInt();
			//saleStatus(kj);
		}else if(jisa instanceof KangwonJisa) {
			kwj = (KangwonJisa) jisa;
			kwj.productName = sc.next();
			System.out.println(kwj + kwj.productName + "판매량은?");
			kwj.salesAmount = sc.nextInt();
		//	saleStatus(kwj);
		}else if(jisa instanceof GejuJisa) {
			gj = (GejuJisa) jisa;
			gj.productName = sc.next();
			System.out.println(gj + gj.productName + "판매량은?");
			gj.salesAmount = sc.nextInt();
		//	saleStatus(gj);
		}
		System.out.println();
		System.out.println("계속 입력하시겠습니까? (y/n)");
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
	 
	 


