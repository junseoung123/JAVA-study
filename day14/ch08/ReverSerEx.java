package ch08;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReverSerEx {

	public static void main(String[] args) throws Exception{
        //�������翡�� serial.txt������ ���ͳݿ� �Ǿ �λ����翡 ���´�
		
		//�λ����翡���� �ٽ� ��ü�� ���̰� �ϱ�
		//�� ����ȭ
		//�� ��� ��Ʈ�� ��ü�����ϱ� 
		FileInputStream fis = new FileInputStream("C:/temp/serial.txt");
		//������� ��Ʈ�� ��ü����
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
        System.out.println("field1 :" + v.field1);
        System.out.println("field2 :" + v.field2.field1);
        System.out.println("field3 :" + v.field3);
        System.out.println("field4 :" + v.field4);
        System.out.println("field5 :" + v.field5);
        
        ois.close();
        fis.close();

	}

}
