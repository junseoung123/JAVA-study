package ch07;

public class kumhoTire extends Tire{

	public kumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// �θ�������� ������ Ÿ���� �ڽĻ����ڸ� ���� �θ�����ڸ� ȣ���ؾ���
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "kumhoTire ���� :" + (maxRotation - accumulatedRotation) + "ȸ");
		return true;
		}else {
			System.out.println("***" + location + "kumhoTire��ũ ***");
			return false;
		}
	}
}
