package ch07;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i=1; i<=5; i++) {//i = 1 2 3 4 5
			int problemLocation = car.run(); //��ũ�� ������ 1 2 3 4 ���� �ƴϸ� 0 ����
			
			switch(problemLocation) {
			case 1:System.out.println("�� ����HankookTire�� ��ü");
			       car.tires[0] = new HankookTire("�Ͽ���", 15);
			       break;
			case 2:System.out.println("�� ������ kumhoTire�� ��ü");
		           car.tires[1] = new kumhoTire("�Ͽ�����", 13);
		           break;
			case 3:System.out.println("�� ���� HankookTire�� ��ü");
	               car.tires[2] = new HankookTire("�Ͽ�����", 14);
	               break;
				
			case 4:System.out.println("�� ������ kumhoTire�� ��ü");
	               car.tires[3] = new kumhoTire("�Ͽ�����", 17);
	               break;
				default :
			}
			
			System.out.println("-----------------------------");
			
		}

	}

}
