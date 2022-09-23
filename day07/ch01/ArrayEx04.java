package ch01;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// ����ó�� ���α׷� 2���� �迭�̿�
		// 1. 2����  7 X 6 �迭 �����ϱ�
		int[][] ia = new  int[7][6];
		// 2. �й� ���� ���� ���������� �Է��� �޾Ƽ�  
		// 5 �ۿ� for, 4 ���� for 
		Scanner sc =new Scanner(System.in);
        for(int i=0; i< ia.length-2 ; i++ ) { //i=0 1 2 3 4
        	for(int j=0; j<ia[i].length - 2; j++ ) { //j = 0 1 2 3 
        		System.out.print( i +"�� ");
        		ia[i][j] = sc.nextInt();
        		if(j==0) continue;
        		ia[i][4] += ia[i][j];
        		ia[5][j] += ia[i][j];
        		ia[5][4] += ia[i][j]; //3. �հ踦 ����Ѵ�
        	}
        	   ia[i][5] = ia[i][4] / 3;
        	   ia[5][5] += ia[i][5];
         }
        
        //4. ��ո� ����Ѵ�
        // 5�� 1�� 5�� 2�� ... 5��  5���������� �հ踦 / 5�ϸ�ȴ�. 
        for(int i=1; i< 6  ; i++) { // 1 2 3 4 5
        	ia[6][i] = ia[5][i] / 5;
        }
        
        //7. ��ü�� ����ϱ�
        System.out.println("<<   ����ó�� ���α׷�  >> ");
        System.out.println();
        System.out.println(" ---------------------------------------------------- ");
        System.out.println("�й�      ����      ����   ����      �հ�   ���");
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
        			System.out.print("��ü�հ�   "); 
        			continue;
        		}
        		else if(j==0 && i==6) {
        			System.out.print("��ü���   ");
        			continue;
        		}
        		System.out.printf("%8d", ia[i][j]);
        	}
        	System.out.println();
        }
        
        //�׽��� �ڵ�
        //�Է��� �κ��� ����� �Ǿ��� Ȯ���ϱ�
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
        System.out.println(" �й�    ����   ");
        System.out.println("--------------");
        for(int i=0; i<ia.length-2; i++) { //i=0 1 2 3 4
        	//System.out.printf("%8d %8d", ia[i][0], rank[i]);
        System.out.println(ia[i][0] + "  " + rank[i]);
        }
        
	}

}
