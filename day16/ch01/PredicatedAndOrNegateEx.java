package ch01;

import java.util.function.IntPredicate;

public class PredicatedAndOrNegateEx {

	public static void main(String[] args) {

        //boolean test(int value);
		IntPredicate predicatedA = a -> a%2 == 0;
		
		IntPredicate predicatedB = a -> a%3 == 0;
		IntPredicate predicateAB;
		
		boolean result;
		
		predicateAB = predicatedA.and(predicatedB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까?" + result);
		
		predicateAB = predicatedA.or(predicatedB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까?" + result);
		
		predicateAB = predicatedA.negate(); //거짓말이면 참 (부정)
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까?" + result);

	}

}
