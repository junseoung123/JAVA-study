package ch01;

public class ForEx02 {

	public static void main(String[] args) {
		// 1~100���� ������ �����
		// 10�ǹ���϶� �ٹٲٱ�
		// ���� �Ʒ��ٿ� ���� ���
		//�����ߴ��� 5���ݺ�
		//�����ߴ��� 3���ݺ�
		for (int k = 1; k <= 3; k++) {
			System.out.println(k + " ��° �ݺ� ===");
			for (int j = 1; j <= 5; j++) {
				System.out.println( k + " ��׷� �ݺ�" + j + " ��° �ݺ� ");
				int sum = 0;
				for (int i = 1; i <= 100; i++) {
					sum += i;
					System.out.print(i + " ");
					if (i % 10 == 0) {
						System.out.println();
					}
			
		}
		System.out.println("�հ� = " + sum);
		System.out.println("--------------------");

	}
	}
}
}