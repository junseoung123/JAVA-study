package ch01;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 2차원 배열을 빈공간을 만들고 키보드로 입력받아서 채우기
		//5행 3열로
		/*Scanner sc = new Scanner(System.in);
		
		int[][] ia1 = new int[5][3];
		for(int i=0; i<ia1.length; i++) { // 0 1 2 3 4
			for(int j=0; j<ia1[i].length; j++) { //0 1 2 
				System.out.println( "jumsu[" + i + "," + j + "] =>");
				ia1[i][j] = sc.nextInt();
			}
		}
		//향상된 for문으로 출력해보기
		for( int[] a : ia1) {
			for( int aa : a) {
				System.out.println( aa + " ");
			}
			System.out.println();
		}*/
	    
		Scanner ac = new Scanner(System.in);
		
		System.out.println("<<성적 처리 프로그램>>"); 
	    System.out.println(("----------------------"));
	    System.out.println("학번" + " " + "국어" + " " + "영어" + " " + "수학" + " " + "합계" + " " + "평균");
	    System.out.println(("----------------------"));
	    
	    int[][] hak = new int[5][6];
	    int[][] hap = new int[2][6];
	    
	    for( int i=0; i<hak.length; i++) {
	    	for(int j=0; j<hak[i].length-2; j++) {
	    		System.out.print( i + " " + j );
	    		hak[i][j] = ac.nextInt();
	    		
	    		
	    	}
	    	System.out.println();
	    }

	}

}
