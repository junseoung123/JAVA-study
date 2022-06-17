package ch09;

public class ChildEx {

	public static void main(String[] args) {
		// 다형성 객체생성
		Parent p1 = new Child();
		
		//Child c1 = new Parent(); X
		//p1 참조변수로 가르킬수이쓴ㄴ것은 어쩐클래스? Parent
		//p1.field = "aaa";
		//p1.method();
		//p1.method2();
		
		//down casting하면 자식클래스에잇는 필드와 메소드 가르치기 가능
		Child c1 = (Child)p1;
		c1.field2="bbb";
		c1.method3();
		
		//실행하면 오류난다  Parent() 객체생성하면 자기만 힙메모리에 올라간다.
		Parent p2 = new Parent();
		Child c2 = (Child) p2;
		c2.field2 ="ddd";
		c2.method3();
		

	}

}
