package ch04;



public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 초기값을 미리 넣고 사용하기
		int[] score = {100, 95, 90, 85, 80, 75, 70};
		
		//2 미리 배열공간 만들어 두고 값을 넣기
		int[] score2 = new int[10];
		double[] da1 = new double[5];
		
		//socre2 배열안에 반복문을 사용하여 값을 넣어보기
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
		
		System.out.println("향상된 for문으로 출력하기");
		//향상된 for문으로 바꾸기 
 // String 변수명<-집합자료들넣어줌 마지막까지 넣어주면 반복 끝
		for(int b  :score2) {
			System.out.print(b + " ");
		}
		
		int jumsu[]= new int[8];
		//jumsu[0} = 10을 넣기
		//10에 대한 변수 JValue
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
		System.out.println("향상된 for문으로 출력");
		for (int a : jumsu) {
			System.out.print(a + " ");
		}
		

	}


	}


