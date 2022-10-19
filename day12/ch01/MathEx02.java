package ch01;

public class MathEx02 {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		//주사위 1~6숫자 무작위 생성
//		0 *6<= (Math.random()*6) <1 *6
//			0 <= (int) (Math.random()*6) <6	
//			0+1 <= (int) (Math.random()*6)+1 <6+1	
		for(int i=0; i<50; i++) {
		System.out.println((int) (Math.random()*6)+1); // *X가지 +1부터랜덤 배출
		}
	}

}
