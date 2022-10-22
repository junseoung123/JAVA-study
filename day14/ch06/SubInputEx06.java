package ch06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SubInputEx06 {

	public static void main(String[] args) {
		//1037
		// ��� ��Ʈ��-�ʼ�, ���� ��ݽ�Ʈ��-����
		// InputStream OutputStream, Reader, Writer << ��ݽ�Ʈ��
		// Bufferedreader, Bufferedwriterm, DataInput<< ������ݽ�Ʈ�� ��ݽ�Ʈ���� �ݵ�� ������ ����Ѵ� *****
	    try {
		FileOutputStream fos1 = new FileOutputStream(new File("C:/temp/fos1.txt")); //�ֱ�� ��Ʈ��
		//������ ���ۿ� ��Ƽ� ó���ϱ�
		
		BufferedOutputStream bos = new BufferedOutputStream(fos1);
		DataOutputStream dos1 = new DataOutputStream(bos); //byte�� int boolean��� ǥ���Ұ� ������Ʈ�� DataOutputStream���
	    
		dos1.writeUTF("ȫ�浿");
		dos1.writeDouble(95.5);
		dos1.writeInt(1);
		
		dos1.writeUTF("���ڹ�");
		dos1.writeDouble(90.3);
		dos1.writeInt(2);
		
		//fos1.write(null)  �ֱ�ݽ�Ʈ���� write�żҵ�ȿ��� �Ű������� double�� boolean�� �⺻���� �ִ°��� �����ϱ� ������Ʈ�����
		dos1.flush();
		dos1.close();
		fos1.close();
		
		FileInputStream its = new FileInputStream("C:/temp/fos1.txt");
		BufferedInputStream bis = new BufferedInputStream(its);
		
		DataInputStream dis = new DataInputStream(bis);
		
		for(int i=0; i<2; i++) {
			String name = dis.readUTF();
			double score= dis.readDouble();
			int order = dis.readInt();
			System.out.println(name + " : " + score + " : " + order);
		}
		
		
		}
	    catch (FileNotFoundException e) {
			
	    	e.printStackTrace();
		}
	    catch (IOException e) {
			
	    	e.printStackTrace();
		}
		
		
 	}
}
