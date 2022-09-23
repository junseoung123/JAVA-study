package ch03;

import java.util.Scanner;

public class StudentMain {
	Scanner sc;
	Student st; 
	boolean flag;

	public static void main(String[] args) {
		// 실행 프로그램
		StudentMain sm = new StudentMain();
		sm.st = new Student();
		sm.flag = true;
	    
	    
	    sm.sc = new Scanner(System.in);
	    int menuChoice=0;
	    
		while(sm.flag) {
			System.out.println("------------------------------");
			System.out.println("1. 성적입력 2. 성적출력 3. 조회하기 4. 종료");
			System.out.println("------------------------------");
			System.out.println("메뉴 >");
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
		System.out.println("<< 전체 학생의 점수 >>");
		System.out.println("-------------------");
		System.out.println("학생명            점수");
		System.out.println("-------------------");
		for(int i=0; i<st.name.length; i++) {
			System.out.println( st.name[i] + "         " + st.jumsu[i]);
			
		}
		System.out.println("----------------------");
		
	}

	public void search() {
		String searchName;
		boolean searchYn=false;
		System.out.println("조회하려는 학생명>");
		searchName = sc.next();
		for(int i =0; i<st.name.length; i++) {
			if( searchName.equals(st.name[i])) {
				System.out.println(st.name[i] + "학생의 점수는" + st.jumsu[i]);
				searchYn = true;
				
				break;
			}
		
		
	}
		if(!searchYn) System.out.println(searchName + "저희반 학생이 아닙니다");
}
	
	public void exit() {
		String yn;
		System.out.println("프로그램을 종료하시겠습니까?(y/n)");
		yn = sc.next();
		yn = yn.toLowerCase();
		if(yn.equals("y")) flag = false;
	
		}
		

	int cnt=0;
	//성적 입력 메소드
			public void input() {
				String name;
				int jumsu;
				if(cnt==3) {
					System.out.println("인원수 초과되었습니다");
				}
				
				System.out.println("성적을 입력하세요>>");
				
				System.out.print("이름>");
				name = sc.next();  //홍길동 입력한 것인 name[0] = 홍길동
				st.name[cnt]=name;
				
				System.out.println("점수 >");
				jumsu = sc.nextInt(); //100 jumsu[0] = 100
				st.jumsu[cnt]=jumsu;
				
				//텍스팅 코드 작성ㄴ
				//System.out.println(st.name[cnt]);
				//System.out.println(st.jumsu[cnt]);
				
				cnt++;//1,2
				
				
			}

}
