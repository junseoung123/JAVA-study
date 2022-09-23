package ch01;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 성적처리 프로그램 2차원 배열이용
		// 1. 2차원  7 X 6 배열 선언하기
		int[][] ia = new  int[7][6];
		// 2. 학번 국어 영어 수학점수를 입력을 받아서  
		// 5 밖에 for, 4 내부 for 
		Scanner sc =new Scanner(System.in);
        for(int i=0; i< ia.length-2 ; i++ ) { //i=0 1 2 3 4
        	for(int j=0; j<ia[i].length - 2; j++ ) { //j = 0 1 2 3 
        		System.out.print( i +"행 ");
        		ia[i][j] = sc.nextInt();
        		if(j==0) continue;
        		ia[i][4] += ia[i][j];
        		ia[5][j] += ia[i][j];
        		ia[5][4] += ia[i][j]; //3. 합계를 계산한다
        	}
        	   ia[i][5] = ia[i][4] / 3;
        	   ia[5][5] += ia[i][5];
         }
        
        //4. 평균를 계산한다
        // 5행 1열 5행 2열 ... 5행  5열까지에서 합계를 / 5하면된다. 
        for(int i=1; i< 6  ; i++) { // 1 2 3 4 5
        	ia[6][i] = ia[5][i] / 5;
        }
        
        //7. 전체를 출력하기
        System.out.println("<<   성적처리 프로그램  >> ");
        System.out.println();
        System.out.println(" ---------------------------------------------------- ");
        System.out.println("학번      국어      영어   수학      합계   평균");
        System.out.println("----------------------------------------------------");
        for(int i=0; i<ia.length -2 ; i++) {
        	for( int j=0; j<ia[i].length ; j++ ) {
        		System.out.printf("%8d", ia[i][j]);
        	}
        	System.out.println();
        }
        System.out.println("----------------------------------------------------");
        for(int i=5; i< ia.length; i++ ) { //i=5 6
        	for(int j=0; j<ia[i].length; j++) { //0 1 2 3 4 5
        		if(j==0 && i==5 ) { 
        			System.out.print("전체합계   "); 
        			continue;
        		}
        		else if(j==0 && i==6) {
        			System.out.print("전체평균   ");
        			continue;
        		}
        		System.out.printf("%8d", ia[i][j]);
        	}
        	System.out.println();
        }
        
        //테스팅 코드
        //입력한 부분이 제대로 되었지 확인하기
        for(int[] a : ia) {
        	for(int aa : a) {
        		System.out.print(aa + "  ");
        	}
        	System.out.println();
        }
        
        int[] rank = new int[5];
        for(int i=0; i< rank.length; i++) {
        	rank[i] = 1;
        }
        for(int i=0; i<ia.length-2; i++) { //i=0 1 2 3 4
        	for(int j=0; j<ia.length-2; j++) {
        		if( ia[i][4] < ia[j][4] ) rank[i]++;
        			
        	}
        	
        	
        }
        System.out.println("-------------");
        System.out.println(" 학번    석차   ");
        System.out.println("--------------");
        for(int i=0; i<ia.length-2; i++) { //i=0 1 2 3 4
        	//System.out.printf("%8d %8d", ia[i][0], rank[i]);
        System.out.println(ia[i][0] + "  " + rank[i]);
        }
        
	}

}
