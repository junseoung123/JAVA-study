package ch04;



public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 �ʱⰪ�� �̸� �ְ� ����ϱ�
		int[] score = {100, 95, 90, 85, 80, 75, 70};
		
		//2 �̸� �迭���� ����� �ΰ� ���� �ֱ�
		int[] score2 = new int[10];
		double[] da1 = new double[5];
		
		//socre2 �迭�ȿ� �ݺ����� ����Ͽ� ���� �־��
		int value=100;
		for( int i=0; i<score2.length; i++) {
			if( value < 70) break;
			score2[i] = value;
			value -= 5;
				
			}
		for(int i=0; i<score2.length; i++) {
			System.out.print(score2[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("���� for������ ����ϱ�");
		//���� for������ �ٲٱ� 
 // String ������<-�����ڷ��־��� ���������� �־��ָ� �ݺ� ��
		for(int b  :score2) {
			System.out.print(b + " ");
		}
		
		int jumsu[]= new int[8];
		//jumsu[0} = 10�� �ֱ�
		//10�� ���� ���� JValue
		int Jvalue = 10;
		for(int i=0; i<jumsu.length; i++) {
			if(Jvalue > 50) break;
			jumsu[i] = Jvalue;
			Jvalue += 10;
			}
		for( int i=0; i<jumsu.length; i++) {
			System.out.print( jumsu[i] + " ");
		}
		System.out.println();
		System.out.println("���� for������ ���");
		for (int a : jumsu) {
			System.out.print(a + " ");
		}
		

	}


	}


