package ch04;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 초기값을 사용해 정수형 배열만들기
		int[] ia = {1, 3, 4, 6};
		
		//향상된 for문으로 출력하기
		for(int b  : ia ) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		//ia.length로 for문 출력하기
		for(int i=0; i<ia.length; i++) {
			System.out.print( ia[i] + " ");
		}
		
		System.out.println();
		for(int i=ia.length-1; i>=0; i--) {
			System.out.print( ia[i] + " ");
		}
		// 1+3+4+6 = 합계 출력하기
		System.out.println();
		
		int sum = 0;
		for(int i=0; i<ia.length; i++) {
			sum += ia[i];
		}
		System.out.println("합계 =" + sum);
		
		System.out.println("평균 =" + sum/ia.length);

	}

}
