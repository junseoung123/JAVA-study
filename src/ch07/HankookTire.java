package ch07;

public class HankookTire extends Tire{

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	//Ŭ������ �����ڸ� ���������� �⺻�����ڸ� �����Ϸ� �ڵ����� ������ش�
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ���� :" + (maxRotation - accumulatedRotation) + "ȸ");
		return true;
		}else {
			System.out.println("***" + location + "HankookTire��ũ ***");
			return false;
		}
		
	}
	
	
}
