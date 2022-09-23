package ch04;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 배열
		//선언하기 타입[] 배열명;
		int[] intArray = null;
		double[] doubleArray;
		String[] stringArray;
		
		int[] iA1 = {1,2,3,4};
		double[] da1 = {1.0, 2.0};
		boolean[] ba1 = {true, false, false};
		String[] sa1 = {"A", "B", "C", "D", "E"};
		
		System.out.println( iA1[0] );
		System.out.println( da1[1]);
		System.out.println( ba1[2]);
		System.out.println( sa1[4]);
		
		System.out.println( iA1[0] + " " + iA1[1] + " " +  iA1[2] + " " +  iA1[3]);
		
		
		for( int i = 0; i<4; i++  ) {
			System.out.print( iA1[i] + " ");
		}
		System.out.println();
		
		for( int i = 0; i<2; i++) {
			System.out.print( da1[i] + " ");
		}
        System.out.println();
		
		for( int i = 0; i<3; i++) {
			System.out.print( ba1[i] + " ");
		}
		System.out.println("================");
		
		//배열의 길이를 구하기
		System.out.println( iA1.length + "배열의 길이");

	
	
}
}