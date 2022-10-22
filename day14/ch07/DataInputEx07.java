package ch07;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class DataInputEx07 {

	public static void main(String[] args) {
		try {
		File file1 = new File("C:/temp/sungjuk.txt");
		FileInputStream fis = new FileInputStream(file1);
		
		DataInputStream dis = new DataInputStream(fis);
		
		//���Ϸ� ������ �о����
		String disData = dis.readLine();
		System.out.println(disData);
		
		//���ڿ� �ڷḦ �ڸ���
		String[] sd = disData.split("/");
		for( String s : sd) {
			System.out.println(s);
		}
		
		//����ȯ�ϰ�
		String name = sd[0];
		Integer kor = Integer.valueOf(sd[1]);
		Integer eng = Integer.valueOf(sd[2]);
		
		int ckor = kor;
		int ceng = eng;
		int ctot = ckor + ceng;
		
		//���Ͽ� ����
		File file2 = new File("C:/temp/copysungjuk.txt");
		FileOutputStream fos = new FileOutputStream(file2);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF(name);
		dos.writeInt(kor);
		dos.writeInt(ceng);
		dos.writeInt(ctot);
		
		dos.flush();
		fos.flush();
		
		dos.close();
		fos.close();
		dis.close();
		fis.close();
		
		
		
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
		    e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
