/*package ch05;

import java.util.Scanner;

public class ProductEx {
	Scanner sc; // new �ؾ��� �����մº���
	boolean flag = true;
	

	public static void main(String[] args) {
		
		
		ProductEx p = new ProductEx();
		p.sc = new Scanner(System.in);
		Product pd = new Product();
		while(p.flag) {
			int choice;
			System.out.println("-------------------");
			System.out.println("1.�Է� 2.��� 3.����");
			System.out.println("-------------------");
			System.out.println("���� ---> ");
			choice = p.sc.nextInt();
			
			switch (choice) {
			  case 1: input(pd); break;
			  case 2: output(); break;
			  case 3: end(p); break;
				  default : System.out.println("�޴��� �ٽ� �����ϼ���");
			}
		}



	}
	
	int inputcnt=0;
	

	private static void input(ProDuct pd) {
		// �Է��ϱ�
		System.out.println("---------------");
		System.out.println("��  ��  ȭ  ��");
		System.out.println("---------------");
		System.out.println("��ǰ �з� --> ");
		String productKind = sc.next(); //
		System.out.println("ǰ     �� --->");
		String productName2 = sc.next(); //����ƽ
		System.out.println("��   ��   �� -->");
		int amount = sc.nextInt();//300
		
		//�迭�ȿ� �Է¹����� �����ϱ�
		pd.productKind[cnt] = productKind;
		pd.productName2[cnt] = productName2;
		//�ǸŰ��� ����ϴ� �żҵ� ���
		compute();
		cnt++;
		
		
		
	}
	//�ǸŰ��� ����ϴ� �żҵ� ȣ���ϱ�
	private void compute() {
		if(��ǰ�� ȭ��ǰ�̸�)
	}

	private static void output() {
		// TODO Auto-generated method stub
		
	}

	private static void end(ProductEx p) {
		// �����ϱ�
		System.out.println("���� �Ϸ�!!");
		p.flag = false;
		
	}

} */
