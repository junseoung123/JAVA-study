package ch04;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
	/*    <<   ����ó�� ���α׷�  >>
	    -------------------------------------------
	     �й�      ����      ����   ����      �հ�   ��� 
	    -------------------------------------------
	     1000      50      60    70       180   60
	     1001      60      70    85       215   72
	     1002      70      75    32       177   59
	     1003      77      85    90       252   84
	     1004      88      66    78       232   77 
	    ------------------------------------------
	    ��ü�հ�    345     356   355     1056   352 
	  ��ü���      69       71    71       211   70

	   ��Ʈ 1�������� �ص� ��
	          �й���   �迭 1�� �����
	          ��ü�հ� �迭 1�� ����� */
		
      System.out.println("  <<   ����ó�� ���α׷�  >> ");
      System.out.println(" ------------------------------------------- ");
      System.out.println(" �й�      ����      ����   ����      �հ�   ���  ");
      System.out.println(" ------------------------------------------- ");
      
      //�迭 ����
      int[] hak = new int[6]; //�й���   �迭 1�� 
      int[] hap = new int[6]; //��ü�հ� �迭 1��
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
     System.out.print("��ü�հ�   ");
     for( int i=1 ; i < 5 ; i++) {
    	 System.out.print( hap[i] + "   ");
     }
     hap[5] = hap[4]/3;
     System.out.print( hap[5]);
     
     
     System.out.println();
     System.out.print("��ü���   ");	
     for( int i=1 ; i < 6 ; i++) {
    	 System.out.print( hap[i] / 5  + "   ");
     }
  }
}
