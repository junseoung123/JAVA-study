package ch01;

public class MathEx02 {

	public static void main(String[] args) {
		
		System.out.println(Math.random());
		//�ֻ��� 1~6���� ������ ����
//		0 *6<= (Math.random()*6) <1 *6
//			0 <= (int) (Math.random()*6) <6	
//			0+1 <= (int) (Math.random()*6)+1 <6+1	
		for(int i=0; i<50; i++) {
		System.out.println((int) (Math.random()*6)+1); // *X���� +1���ͷ��� ����
		}
	}

}
