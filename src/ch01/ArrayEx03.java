package ch01;

import java.util.Scanner;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 2���� �迭�� ������� ����� Ű����� �Է¹޾Ƽ� ä���
		//5�� 3����
		/*Scanner sc = new Scanner(System.in);
		
		int[][] ia1 = new int[5][3];
		for(int i=0; i<ia1.length; i++) { // 0 1 2 3 4
			for(int j=0; j<ia1[i].length; j++) { //0 1 2 
				System.out.println( "jumsu[" + i + "," + j + "] =>");
				ia1[i][j] = sc.nextInt();
			}
		}
		//���� for������ ����غ���
		for( int[] a : ia1) {
			for( int aa : a) {
				System.out.println( aa + " ");
			}
			System.out.println();
		}*/
	    
		Scanner ac = new Scanner(System.in);
		
		System.out.println("<<���� ó�� ���α׷�>>"); 
	    System.out.println(("----------------------"));
	    System.out.println("�й�" + " " + "����" + " " + "����" + " " + "����" + " " + "�հ�" + " " + "���");
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
