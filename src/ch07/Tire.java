package ch07;

public class Tire {
	//�ʵ� 314
	public int maxRotation;//�ִ�ȸ����
	public int accumulatedRotation;//����ȸ����
	public String location;//Ÿ�̾��� ��ġ
	
	//�θ��� ����� ������
	//�θ��� ����� �����ڸ� ���α׷��Ӱ� ������ָ� �⺻�����ڴ� �����Ϸ��� ������ �ʴ´�
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	
	
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire ���� :" + (maxRotation - accumulatedRotation) + "ȸ");
		return false;
		}else {
			System.out.println("***" + location + "Tire��ũ ***");
			return false;
		}
	}

}
