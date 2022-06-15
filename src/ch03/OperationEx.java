package ch03;

public class OperationEx {
             //연산자 예제
	public static void main(String[] args) {
		// 연산자 산술연산자 사칙연산
		int a1=10, a2=20, a3;
		a3 = a1 + a2;
		System.out.println(a3);
		
		a3 = a1 - a2;
		System.out.println(a3);
		
		a3 = a1 * a2;
		System.out.println(a3);
		
		a3 = a1 / a2;
		System.out.println(a3);
		
		a3 = a1 % a2;
		System.out.println(a3);
		
		a3 = a1 + a2 - a1 * 2;
		System.out.println(a3);
		
		++a1; // ++a1 후위연산자     a1++; 전위 연산자 //a1 = a1 + 1;
		System.out.println(a1);
		
		a3 = a1++; //먼저 내려놓고(a3에 넣어주고) a1을 1개 더한다
		   //++a1; a1에 1개를 더하고 난후 a1을 내려놓는다(a3에 넣어준다)
		System.out.println("a1 = " + a1 + "a3 = " + a3);
		
		a3 = ++a2 + a2++ - a1++ + --a2;  // --a2 는 a2 = a2 -1
		//    21  + 21   - 13   + 21
		System.out.println("a3 = " + a3 + "a2 = " + a2 + "a2 = " + a1);
        //a3 = 50 a2 = 21 a1 =14
		
		
		//비트연산자
		System.out.println("===비트연산자===");
		System.out.println(3 & 10);
		System.out.println(0b00000011 & 0b00001010); //2진수
		System.out.println(00003 & 00012);//10진수
		System.out.println(0x03 & 0x0A); // 0~9 10=A 11=B 12=C   0x = 16진수
	
		System.out.println(3 | 10);
		System.out.println(0b00000011 | 0b00001010); 
		System.out.println(00003 | 00012);
		System.out.println(0x03 | 0x0A);
		
		System.out.println(3 ^ 10);
		System.out.println(0b00000011 ^ 0b00001010); //2진수
		System.out.println(00003 ^ 00012);//10진수
		System.out.println(0x03 ^ 0x0A);
		
		System.out.println(~0b11111100);
		
		//쉬프트연산자 << >> >>>
		// 2의 배수만큼 곱하거나 나눌때 사용
		int a = 8;
		System.out.println(a << 4); // 8 * 2
		System.out.println(a >> 3);
		
	}

}
