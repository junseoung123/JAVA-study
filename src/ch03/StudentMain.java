package ch03;

import java.util.Scanner;

public class StudentMain {
	Scanner sc;
	Student st; 
	boolean flag;

	public static void main(String[] args) {
		// ���� ���α׷�
		StudentMain sm = new StudentMain();
		sm.st = new Student();
		sm.flag = true;
	    
	    
	    sm.sc = new Scanner(System.in);
	    int menuChoice=0;
	    
		while(sm.flag) {
			System.out.println("------------------------------");
			System.out.println("1. �����Է� 2. ������� 3. ��ȸ�ϱ� 4. ����");
			System.out.println("------------------------------");
			System.out.println("�޴� >");
			menuChoice = sm.sc.nextInt();
			
			switch(menuChoice) {
			case 1: sm.input(); break;
			case 2: sm.output(); break;
			case 3: sm.search(); break;
			case 4: sm.exit(); 
				
			}
			
		}
		
	}//end main
	
	public void output() {
		System.out.println("<< ��ü �л��� ���� >>");
		System.out.println("-------------------");
		System.out.println("�л���            ����");
		System.out.println("-------------------");
		for(int i=0; i<st.name.length; i++) {
			System.out.println( st.name[i] + "         " + st.jumsu[i]);
			
		}
		System.out.println("----------------------");
		
	}

	public void search() {
		String searchName;
		boolean searchYn=false;
		System.out.println("��ȸ�Ϸ��� �л���>");
		searchName = sc.next();
		for(int i =0; i<st.name.length; i++) {
			if( searchName.equals(st.name[i])) {
				System.out.println(st.name[i] + "�л��� ������" + st.jumsu[i]);
				searchYn = true;
				
				break;
			}
		
		
	}
		if(!searchYn) System.out.println(searchName + "����� �л��� �ƴմϴ�");
}
	
	public void exit() {
		String yn;
		System.out.println("���α׷��� �����Ͻðڽ��ϱ�?(y/n)");
		yn = sc.next();
		yn = yn.toLowerCase();
		if(yn.equals("y")) flag = false;
	
		}
		

	int cnt=0;
	//���� �Է� �޼ҵ�
			public void input() {
				String name;
				int jumsu;
				if(cnt==3) {
					System.out.println("�ο��� �ʰ��Ǿ����ϴ�");
				}
				
				System.out.println("������ �Է��ϼ���>>");
				
				System.out.print("�̸�>");
				name = sc.next();  //ȫ�浿 �Է��� ���� name[0] = ȫ�浿
				st.name[cnt]=name;
				
				System.out.println("���� >");
				jumsu = sc.nextInt(); //100 jumsu[0] = 100
				st.jumsu[cnt]=jumsu;
				
				//�ؽ��� �ڵ� �ۼ���
				//System.out.println(st.name[cnt]);
				//System.out.println(st.jumsu[cnt]);
				
				cnt++;//1,2
				
				
			}

}
