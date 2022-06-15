package ch01;

public class ClassEx01 {
	
	public static void main(String[] arg) {
		//생성자를 사용하여서 "홍길동", "컴공", 100, 80 자료 입력해보기
		
		Sungjuk s1= new Sungjuk("홍길동", "컴공", 100, 80);
		//필드로 출력하기
		System.out.println(s1.name);
		System.out.println(s1.dept);
		//System.out.println(s1.kor); private 접근제한자라서
		//System.out.println(s1.mat); private 접근제한자라서
		
		//getter 출력
		System.out.println(s1.getName());
		System.out.println(s1.getDept());
		System.out.println(s1.getKor());
		System.out.println(s1.getMat());
		
		//기본생성자로 객체생성하세요
		Sungjuk s2 = new Sungjuk();
		System.out.println(s2.add(10, 20));
		System.out.println(s2.add(11.34, 22.55));
		System.out.println(s2.add("이름은", "홍길동", "입니다"));
	}

	
		

	}


