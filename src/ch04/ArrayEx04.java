package ch04;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 빈 정수형 배열 10개 선언하기
		int[] ia = new int[10];
		
		//향상된 for문으로 출력하기
		for( int a : ia) {
			System.out.println( a + " ");
			
		}
		System.out.println();
		double[] da = new double[10];
		
		//향상된 for문으로 출력하기
		for(double a : da) {
			System.out.print( a + " ");
		}
		System.out.println();
		String[] sa = new String[10];
		
		//향상된 for문으로 출력하기
		for(String a : sa) {
			System.out.print( a + " ");
		}
		System.out.println();
		
		boolean[] ba = new boolean[10];
		//향상된 for문으로 출력하기
		for( boolean a : ba) {
			System.out.print( a + " ");
		}
		
		int sii; //스택공간에 올라감 변수는 초기값에 자동으로 올라감
		//System.out.println( sii );

	}

}
