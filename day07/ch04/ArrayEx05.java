package ch04;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
	/*    <<   성적처리 프로그램  >>
	    -------------------------------------------
	     학번      국어      영어   수학      합계   평균 
	    -------------------------------------------
	     1000      50      60    70       180   60
	     1001      60      70    85       215   72
	     1002      70      75    32       177   59
	     1003      77      85    90       252   84
	     1004      88      66    78       232   77 
	    ------------------------------------------
	    전체합계    345     356   355     1056   352 
	  전체평균      69       71    71       211   70

	   힌트 1차원으로 해도 됨
	          학번별   배열 1개 만들고
	          전체합계 배열 1개 만들고 */
		
      System.out.println("  <<   성적처리 프로그램  >> ");
      System.out.println(" ------------------------------------------- ");
      System.out.println(" 학번      국어      영어   수학      합계   평균  ");
      System.out.println(" ------------------------------------------- ");
      
      //배열 선언
      int[] hak = new int[6]; //학번별   배열 1개 
      int[] hap = new int[6]; //전체합계 배열 1개
      Scanner sc = new Scanner(System.in);
      
     for(int j=0; j<5; j++) {
    	  hak[0] = sc.nextInt();
    	  hak[4] = 0;
	      for(int i=1; i < 4 ; i++  ) {
	    	    hak[i] = sc.nextInt(); // 50
	    	    hak[4] += hak[i];
	    	    hap[i] += hak[i];
	    	    hap[4] += hak[i];
	      }
	      hak[5] = hak[4] / 3;
	      for(int i=0; i<6; i++) {
	    	  System.out.print( hak[i] + "    ");
	      }
	      System.out.println();
     }
     System.out.println(" ------------------------------------------- ");
     System.out.print("전체합계   ");
     for( int i=1 ; i < 5 ; i++) {
    	 System.out.print( hap[i] + "   ");
     }
     hap[5] = hap[4]/3;
     System.out.print( hap[5]);
     
     
     System.out.println();
     System.out.print("전체평균   ");	
     for( int i=1 ; i < 6 ; i++) {
    	 System.out.print( hap[i] / 5  + "   ");
     }
  }
}
