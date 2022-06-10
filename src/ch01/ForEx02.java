package ch01;

public class ForEx02 {

	public static void main(String[] args) {
		// 1~100까지 나오게 만들기
		// 10의배수일때 줄바꾸기
		// 가장 아래줄에 합을 찍기
		//지금했던거 5번반복
		//지금했던걸 3번반복
		for (int k = 1; k <= 3; k++) {
			System.out.println(k + " 번째 반복 ===");
			for (int j = 1; j <= 5; j++) {
				System.out.println( k + " 대그룹 반복" + j + " 번째 반복 ");
				int sum = 0;
				for (int i = 1; i <= 100; i++) {
					sum += i;
					System.out.print(i + " ");
					if (i % 10 == 0) {
						System.out.println();
					}
			
		}
		System.out.println("합계 = " + sum);
		System.out.println("--------------------");

	}
	}
}
}