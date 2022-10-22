package ch04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class FileReaderEx04 {

	public static void main(String[] args) {
		// ���ڱ�� ������ �о �����ϴ� ���
		try {
		File f1 = new File("C:/temp/address.txt");
		File f2 = new File("C:/temp/copyAddress.txt");
		
		FileReader fr1 = new FileReader(f1, Charset.forName("UTF-8"));
		FileWriter fw1 = new FileWriter(f2, Charset.forName("utf-8"));
		
		char[] cArr = new char[100];
		
		int readBytes;
		
		while((readBytes = fr1.read())!=-1) {
			//System.out.println((char)readBytes);
		    fw1.write(readBytes);
		    fw1.flush();//���۾� �ڷḦ ��� �������� 
		}
		
		//���� ������� �̹����� �����غ��� ~Reader ~Writer Ŭ���� ���Ұ� �̹����� ����Ʈ��� ó���� ������
		File i1 = new File("C:/Temp/snoopy");
		File i2 = new File("C:/Temp/copysnoopy1");
		
		FileReader ir1 = new FileReader(i1 );
		FileWriter iw1 = new FileWriter(i2 );
	
		while((readBytes = ir1.read())!=-1) {
			//System.out.println((char)readBytes);
		    iw1.write(readBytes);
		    iw1.flush();//���۾� �ڷḦ ��� �������� 
		}
		
		//Ű����� �Է¹޾Ƽ� ���� ������
		
		File f3 = new File("c://temp//keyFile.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("�̰��� ���ڸ� �Է����ּ���");
		String keyin = sc.next();
	     
		FileWriter fw3 = new FileWriter(f3);
		fw3.write(keyin);
		fw3.flush();
		fw3.close();
		
		
		
		} catch (FileNotFoundException e) {
			System.out.println("���Ͽ���");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
