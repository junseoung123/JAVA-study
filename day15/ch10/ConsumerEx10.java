package ch10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntToLongFunction;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

public class ConsumerEx10 {

	public static void main(String[] args) {
		// 691
		Consumer<String> consumer = (String t) -> System.out.println(t + "8"); //람다식 함수만듬
		Consumer<Integer> consumer1 = (t) -> System.out.println(t + "8"); //람다식 함수만듬
		
		Supplier<String> supplier1 = ()-> { return "생산자 자료";};
		
		Function<Integer, String> f1 = ( t ) -> { t = t + 100; return t + "가산점";};
		
		IntToLongFunction itl = ( v ) -> { return v; };
		
		//ToDoubleBiFunction<Integer, Integer> tdbf = (t, u) -> { return (t+u)/2.0; };
		ToDoubleBiFunction<Integer, Integer> tdbf = (t, u) ->  (t+u)/2.0;
		//호출하기
		consumer.accept("Java");
		consumer1.accept(500);
		String result = supplier1.get();
		System.out.println(result);
		
		result = f1.apply(50);
		System.out.println(result);
		
		Long result2 = itl.applyAsLong(100);
		System.out.println("롱타입의 크기" + result2.SIZE);
		System.out.println(result2);
		
		double result3 = tdbf.applyAsDouble(10, 30); //객체 10과 30을 넣어주면 두개가 평균의 Double형으로 출력하기
		System.out.println(result3);
		
		
		//698
		
		
		
		

	}

}
