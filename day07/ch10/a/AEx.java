package ch10.a;


import ch10.a.a1.aa2.AA2;
import ch10.a.b1.bb1.bbb1.p;
import ch10.a.b1.bb1.bbb1.s;
import ch10.a.b1.bb2.BB2;

public class AEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AA1 aa1 = new AA1();
		
		BB2 bb2 = new BB2(); //다른 패키지안에 잇어서 에러
		
		s s = new s();
		
		p p = new p();
		
		//AA2클래스 객체생성
		//AA2 aa2 = new AA2(1,2);
	}

}
