package ch01;

public class VaribleEx {
             //변수 정하기
	static int sa=200; //컴파일할 때 메모리 할당되고 프로그램이 끝날때까지 메모리에 계속 남아있다
	//static을 사용하는 변수는 계속 변수의 값을 유지해야하는 변수
	int ia=100;
	//임시로 사용하고 버려도 되는 변수
	
	public       static              void        main(String[] args) {
	//접근제한자, 정적 스택영역 할당해라	    리턴타입          메소드명
		Ex01 ex01 = new Ex01();
        ex01.ex01Method();
        
        System.out.println(sa); //sa값을 출력해라
        
        VaribleEx ve = new VaribleEx(); //VaribleEx라는 클래스값을 ve로 정하기
        System.out.println(ve.ia); //ve안에 있는 ia값을 출력해라
        
        int returnVar = ve.method2(); //메소드 호출하여서 리턴받아 변수에 담기
        System.out.println(returnVar); //출력하기
        
        String returnName = ve.method3();
        System.out.println(returnName);
        
        boolean returnBoolean =ve.method4();
        System.out.println(returnBoolean);
        
        double returnDouble =ve.method5();
        System.out.println(returnDouble);
        
        float returnFloat =ve.method6();
        System.out.println(returnFloat);
	}
	//리턴타입은 메소드를 수행하고 나면 메소드 호춣하는 곳으로 되돌려주어야하는 자료형
        public int method2() {
        	return 300; //리턴값
        	
        }
        public String method3() {
        	return "홍길동";
        }
        //true false return 하는 메소드 선언하기
        public boolean method4() {
        	return true;
        }
        //3.14숫자 return하는 메소드 선언하기
        public double method5() {
        	return 3.14;
        }
        //500.78f 숫자를 return하는 메소드 선언하기 float
        public float method6() {
        	return 500.78f;
        }
}
