package ch01;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 2�����迭
		int[][] ia1;
		
		//3�� 4��¥�� �迭 ���޸𸮿� �����ϱ�
		
		ia1 = new int[3][4];
		
		//���� �ֱ�
		int value =10;
		for(int i=0; i<ia1.length; i++) {    //0 1 2
			for(int j=0; j<ia1[i].length; j++) { //0 1 2 3
				ia1[i][j] = value;
				value += 10;
				System.out.print( ia1[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0; i<ia1.length; i++) {
			for(int j=0; j<ia1[i].length; j++) {
				System.out.print( ia1[i][j] + " ");
			}
			System.out.println();
		}
		
		//���� for��
		for(int[] a : ia1) {
			for( int aa : a) {
				System.out.print( aa + " ");
			}
			System.out.println();
		}
		System.out.println("2����� ����ϱ�");
		for(int i=2; i>=0; i--) {  // 2>=0 
			for(int j=0; j<ia1[i].length; j++) {
				System.out.print( ia1[i][j] + " ");
			}
			System.out.println();
		}

	}

}
