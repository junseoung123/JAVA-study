/*package ch05;

import java.util.Scanner;

public class ProductEx {
	Scanner sc; // new 해야지 쓸수잇는변수
	boolean flag = true;
	

	public static void main(String[] args) {
		
		
		ProductEx p = new ProductEx();
		p.sc = new Scanner(System.in);
		Product pd = new Product();
		while(p.flag) {
			int choice;
			System.out.println("-------------------");
			System.out.println("1.입력 2.출력 3.종료");
			System.out.println("-------------------");
			System.out.println("선택 ---> ");
			choice = p.sc.nextInt();
			
			switch (choice) {
			  case 1: input(pd); break;
			  case 2: output(); break;
			  case 3: end(p); break;
				  default : System.out.println("메뉴를 다시 선택하세요");
			}
		}



	}
	
	int inputcnt=0;
	

	private static void input(ProDuct pd) {
		// 입력하기
		System.out.println("---------------");
		System.out.println("입  력  화  면");
		System.out.println("---------------");
		System.out.println("제품 분류 --> ");
		String productKind = sc.next(); //
		System.out.println("품     명 --->");
		String productName2 = sc.next(); //립스틱
		System.out.println("판   매   량 -->");
		int amount = sc.nextInt();//300
		
		//배열안에 입력받은거 저장하기
		pd.productKind[cnt] = productKind;
		pd.productName2[cnt] = productName2;
		//판매가를 계산하는 매소드 출력
		compute();
		cnt++;
		
		
		
	}
	//판매가를 계산하는 매소드 호출하기
	private void compute() {
		if(제품이 화장품이면)
	}

	private static void output() {
		// TODO Auto-generated method stub
		
	}

	private static void end(ProductEx p) {
		// 종료하기
		System.out.println("좋은 하루!!");
		p.flag = false;
		
	}

} */
