package ch01;

public class ArrayEx01 {

	public static void main(String[] args) {
		// �Ǽ��� ���� ���� 5���迭
		
		double[] da1 = new double[5];
		
		int[] ia;
		ia = new int[5];
		
		//�ʱⰪ�� ����ؼ� ���ڿ� �迭 ����� ���� "ȫ�浿, �̼���"
		String[] sa = {"ȫ�浿", "�̼���"};
		
		// 2���� �迭 �����
		//1. ����� ���� ���餷�� ���� �� �ֱ�
		int[][] ia2 = new int[3][4];
		int[][][] ia3 = new int[2][3][4];
		
		// 2�ʱⰪ���� �ֱ�
		int[][] ia4 = {{1,2,3,4, }, {5,6,7,8 }, {9,10,11,12 }  };
		int[][] ia5 = {{5,9,3,}, {3,2,0}};
		
		System.out.println( ia4[1][3]);
		System.out.println( ia5[0][1]);
		
		for(int i=0; i<ia4.length; i++) {
			for(int j=0; j<ia4[i].length; j++) {
				System.out.print( ia4[i][j] + " ");
			}
			System.out.println();

	}
		for(int i=0; i<ia5.length; i++) {
			for(int j=0; j<ia5[i].length; j++) {
				System.out.print( ia5[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(ia4.length);//3 ia4 ���� ����
		System.out.println(ia4[0].length);//4 ia4[] ���� ����
		
		System.out.println(ia4.length);//2
		System.out.println(ia4[0].length);//3
		
		System.out.println( ia4[4][6]); //ArrayIndexOutOfBoundsException �߻�
	}
}
