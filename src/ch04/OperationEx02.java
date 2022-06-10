package ch04;

public class OperationEx02 {

	public static void main(String[] args) {
		// 비교연산자
		int a=10, b=20;
		System.out.println(a>b);
		System.out.println( a<b );
		System.out.println( a == 10);//같냐?
		System.out.println (a != 10);//같지않느냐?
		
		//논리연산자 && || !
		boolean aa=true, bb=false;
		System.out.println( aa && bb);
		System.out.println( aa || bb);
		System.out.println( !aa);
		
		//축약연산자
		int aaa=10;
		System.out.println( aaa += 10); //aaa = aaa+ 10
		System.out.println( aaa -= 20);// aaa = aaa - 20
		System.out.println( aaa *= 30);// aaa = aaa * 30
		
		//3항연산자
		int k=5, m=7;
		String t = ( k+10 > m-3)    ? "참":"거짓";
		System.out.println(t);
		

	}

}
