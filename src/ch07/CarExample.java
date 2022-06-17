package ch07;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for(int i=1; i<=5; i++) {//i = 1 2 3 4 5
			int problemLocation = car.run(); //펑크가 났으면 1 2 3 4 리턴 아니면 0 리턴
			
			switch(problemLocation) {
			case 1:System.out.println("앞 왼쪽HankookTire로 교체");
			       car.tires[0] = new HankookTire("암왼쪽", 15);
			       break;
			case 2:System.out.println("앞 오른쪽 kumhoTire로 교체");
		           car.tires[1] = new kumhoTire("암오른쪽", 13);
		           break;
			case 3:System.out.println("뒤 왼쪽 HankookTire로 교체");
	               car.tires[2] = new HankookTire("암오른쪽", 14);
	               break;
				
			case 4:System.out.println("뒤 오른쪽 kumhoTire로 교체");
	               car.tires[3] = new kumhoTire("암오른쪽", 17);
	               break;
				default :
			}
			
			System.out.println("-----------------------------");
			
		}

	}

}
