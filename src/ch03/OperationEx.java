package ch03;

public class OperationEx {
             //������ ����
	public static void main(String[] args) {
		// ������ ��������� ��Ģ����
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
		
		++a1; // ++a1 ����������     a1++; ���� ������ //a1 = a1 + 1;
		System.out.println(a1);
		
		a3 = a1++; //���� ��������(a3�� �־��ְ�) a1�� 1�� ���Ѵ�
		   //++a1; a1�� 1���� ���ϰ� ���� a1�� �������´�(a3�� �־��ش�)
		System.out.println("a1 = " + a1 + "a3 = " + a3);
		
		a3 = ++a2 + a2++ - a1++ + --a2;  // --a2 �� a2 = a2 -1
		//    21  + 21   - 13   + 21
		System.out.println("a3 = " + a3 + "a2 = " + a2 + "a2 = " + a1);
        //a3 = 50 a2 = 21 a1 =14
		
		
		//��Ʈ������
		System.out.println("===��Ʈ������===");
		System.out.println(3 & 10);
		System.out.println(0b00000011 & 0b00001010); //2����
		System.out.println(00003 & 00012);//10����
		System.out.println(0x03 & 0x0A); // 0~9 10=A 11=B 12=C   0x = 16����
	
		System.out.println(3 | 10);
		System.out.println(0b00000011 | 0b00001010); 
		System.out.println(00003 | 00012);
		System.out.println(0x03 | 0x0A);
		
		System.out.println(3 ^ 10);
		System.out.println(0b00000011 ^ 0b00001010); //2����
		System.out.println(00003 ^ 00012);//10����
		System.out.println(0x03 ^ 0x0A);
		
		System.out.println(~0b11111100);
		
		//����Ʈ������ << >> >>>
		// 2�� �����ŭ ���ϰų� ������ ���
		int a = 8;
		System.out.println(a << 4); // 8 * 2
		System.out.println(a >> 3);
		
	}

}
