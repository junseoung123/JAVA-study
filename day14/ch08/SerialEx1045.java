package ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialEx1045 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// ����ȭ 
	    // �� ��� ��Ʈ�� �����
		FileOutputStream fos = new FileOutputStream(new File("c:/temp/serial.txt"));
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA();
		classA.field1 = 100;
		classA.field2.field1 = 200;
		classA.field3 = 300;
		classA.field4 = 400;
		classA.field5 = 500;
		
		//����ȭ�ϴ� �޼ҵ� ȣ��
		oos.writeObject(classA);
		oos.flush();
		oos.close();
		fos.close();
		
		
		
	}

}

//����ȭ �Ϸ��� Ŭ������ implements Serializable
//����ȭ ��Ʈ��ũ�� �����͸� ������ ���ؼ� �ݵ�� ó���ؾ��ϴ°�
class ClassA implements Serializable{
	
	static final long serialVersionUID = 1234123141251L;
	int field1;
	ClassB field2 = new ClassB();
	static int field3; //����ȭ ����
	transient int field4; //����ȭ ����
	int field5;
}

class ClassB implements Serializable{
    int field1;	
}
