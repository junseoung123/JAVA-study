package ch04;

public class ArrayEx03 {

	public static void main(String[] args) {
		// �ʱⰪ�� ����� ������ �迭�����
		int[] ia = {1, 3, 4, 6};
		
		//���� for������ ����ϱ�
		for(int b  : ia ) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		//ia.length�� for�� ����ϱ�
		for(int i=0; i<ia.length; i++) {
			System.out.print( ia[i] + " ");
		}
		
		System.out.println();
		for(int i=ia.length-1; i>=0; i--) {
			System.out.print( ia[i] + " ");
		}
		// 1+3+4+6 = �հ� ����ϱ�
		System.out.println();
		
		int sum = 0;
		for(int i=0; i<ia.length; i++) {
			sum += ia[i];
		}
		System.out.println("�հ� =" + sum);
		
		System.out.println("��� =" + sum/ia.length);

	}

}
