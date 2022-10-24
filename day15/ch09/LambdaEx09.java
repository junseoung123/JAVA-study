package ch09;

public class LambdaEx09 {

	public static void main(String[] args) {
		Runnable runnalbe1 = new Runnable() {
			
			@Override
			public void run() {
				
			}
		};
		Runnable runnable1 = () -> { };
		
		//method()�� ȣ���غ���
		MyFunctionInterface fi = new MyFunctionInterface() {
			
			@Override
			public void method() {
				System.out.println("���ٽ� �������!!!");
			}
			};
			fi.method();
			
			//���ٽ����� �����ϱ�
			MyFunctionInterface fi1 = () ->{System.out.println("���ٽ� �������!!");};
			fi1.method();
			
			//A a1 = (int a) ->{System.out.println(a);};
			//A a1 = ( a) ->{System.out.println(a);};
			//A a1 = a ->{System.out.println(a);};
			A a1 = a ->System.out.println(a);
			a1.aMethod(100);
			
			//�Լ�ȣ��
			//Sum s = (String a,int b,int c) -> {return a + " " + b + " "+ c;};
			Sum<String, Integer, Integer> s = (String a, Integer b, Integer c) ->  a + " " + b + " "+ c;
			Sum<String, Double, Boolean> s2 = (String a, Double b, Boolean c) ->  a + " " + b + " "+ c;
			System.out.println(s.sumMethod("ȫ�浿", 50, 50)); //���ȭ�� ȫ�浿 50 50
			System.out.println(s2.sumMethod("ȫ�浿", 50.2, true));

	}
	
	

}

@FunctionalInterface //�Լ��� �������̽�  
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