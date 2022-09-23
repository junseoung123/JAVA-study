package ch01;

public class ForEx03 {
    
	public static void main(String[] args) {
		// 열을 먼저 나오게 해 보기 12345
		// 행을 나오게 하기 123
		for(int i=1; i<=3; i++) {
		for(int j=1; j<=5; j++) {
			System.out.print( "[ " + i + ", " + j + " ]");
		}
		System.out.println();

	}
		for (int i=1; i<=5; i++) {
			for(int j=1; j <= i; j++ ) {
				System.out.print("*");
			}
			System.out.println();
	}
		for (int i=2; i<=9; i++) {
			System.out.print( i + "단 ");
			for(int j=1; j<=9; j++) {
				System.out.print(i + "X" + j + "=" + i*j + " " );
				
			}
		System.out.println();
		}
		for(int i=1; i<=9; i++) {
			for(int  j=2; j<=9; j++) {
				System.out.print( j + "X" + i + "=" + j*i + " ");
			
			}
			System.out.println();
		}
	
}
}