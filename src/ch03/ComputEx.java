package ch03;

public class ComputEx {
	public static void main(String[] args) {
		
		int r=10;
		//�θ� Ŭ���� ��ü����
		Calculator calculator = new Calculator();
		System.out.println(calculator.areaCircle(r));
		//�ڽ�Ŭ���� ��ü ����
		Compute compute = new Compute();
		System.out.println(compute.areaCircle(r));
		
		System.out.println();
		
		System.out.println("----toString()�� �������� �κ� -------");
		System.out.println(calculator.toString());
		System.out.println(calculator);
		
		System.out.println("---hashcode()������ �κ�------");
		System.out.println(calculator.hashCode());
		
		
		
	}

}
