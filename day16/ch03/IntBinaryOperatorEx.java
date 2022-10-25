package ch03;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator operator;
		
		//int applyAsInt(int left, int right);
		operator = (x,y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1 :" + operator.applyAsInt(1, 2));
		
		operator = Calculator::staticMethod;
		System.out.println("결과2 :" + operator.applyAsInt(1, 2));
		
		Calculator calculator = new Calculator();
		operator = (x,y)-> calculator.instanceMethod(x, y);
		System.out.println("결과3 :" + operator.applyAsInt(3, 4));
		
		operator = calculator::instanceMethod;
		System.out.println("결과4 :" + operator.applyAsInt(3, 4));

	}

}


class Calculator {
	public static int staticMethod (int x, int y) {
		return x+y;
	}
	
	public int instanceMethod (int x, int y) {
		return x+y;
	}
}
