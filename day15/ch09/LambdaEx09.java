package ch09;

public class LambdaEx09 {

	public static void main(String[] args) {
		Runnable runnalbe1 = new Runnable() {
			
			@Override
			public void run() {
				
			}
		};
		Runnable runnable1 = () -> { };
		
		//method()를 호출해보기
		MyFunctionInterface fi = new MyFunctionInterface() {
			
			@Override
			public void method() {
				System.out.println("람다식 배워야지!!!");
			}
			};
			fi.method();
			
			//람다식으로 수행하기
			MyFunctionInterface fi1 = () ->{System.out.println("람다식 배워야지!!");};
			fi1.method();
			
			//A a1 = (int a) ->{System.out.println(a);};
			//A a1 = ( a) ->{System.out.println(a);};
			//A a1 = a ->{System.out.println(a);};
			A a1 = a ->System.out.println(a);
			a1.aMethod(100);
			
			//함수호출
			//Sum s = (String a,int b,int c) -> {return a + " " + b + " "+ c;};
			Sum<String, Integer, Integer> s = (String a, Integer b, Integer c) ->  a + " " + b + " "+ c;
			Sum<String, Double, Boolean> s2 = (String a, Double b, Boolean c) ->  a + " " + b + " "+ c;
			System.out.println(s.sumMethod("홍길동", 50, 50)); //출력화면 홍길동 50 50
			System.out.println(s2.sumMethod("홍길동", 50.2, true));

	}
	
	

}

@FunctionalInterface //함수적 인터페이스  
interface MyFunctionInterface {
	public void method();
}

@FunctionalInterface
interface A {
	void aMethod(int a);
}

@FunctionalInterface
interface Sum<S, A, B>{
	S sumMethod(S a, A b, B c);
}