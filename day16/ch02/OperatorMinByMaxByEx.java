package ch02;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByEx {

	public static void main(String[] args) {
		//711
		//2���� ������ ���Ǽ� ���´�
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy( (f1, f2)-> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 10000)); //����
		System.out.println(fruit.name);

		binaryOperator = BinaryOperator.maxBy( (f1, f2)-> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 10000)); //����
		System.out.println(fruit.name);

	}

}


class Fruit{
	String name;
	int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
