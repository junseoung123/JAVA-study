package ch03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;

public class FileInputStreamEx03 {

	public static void main(String[] args) {
		
		// 997 io��Ʈ��
		// ���� �о���̱�
		try {
	  File file1 = new File("C://Temp/readEx01.txt"); //������� ���� ��ü����
	  File file2 = new File("c://Temp/writeEx01.txt");
	  
	  FileInputStream fis = new FileInputStream(file1);
	  int readByte;
	  //byte[] barr = new byte[30];
	  
	  //��� ��Ʈ��
	  FileOutputStream fos = new FileOutputStream(file2);
	  while((readByte =fis.read())!=-1) {
		  fos.write(readByte);
		  
	  }
	// �׸�����
			// read(�迭) write����)
			
			File file3 = new File("c:\\Temp\\snoopy");
			File file4  = new File("c:\\Temp\\copysnoopy");
			
			FileInputStream fis3 = new FileInputStream(file3);
			FileOutputStream fos3 = new FileOutputStream(file4);
			int readBytes;
			byte[] bArr3 = new byte[100];
			while((readBytes = fis3.read(bArr3)) != -1) {
			fos3.write(bArr3);
			}
			fos3.close();
			fis.close();
			
			File file5 = new File("address.txt");
			
			Reader reader = new Reader() {
				char[] cbuf = new char[100];
				
				@Override
				public int read(char[] cbuf, int off, int len) throws IOException {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public void close() throws IOException {
					// TODO Auto-generated method stub
					
				}
			}; //Reader��� Ŭ������ �߻�Ŭ�����̴�. ������ �ڽ�Ŭ������ �ΰ� �������ؼ� ����ؾ��Ѵ�
	  
			
			
		 
	 
	 // while((readByte=fis.read()) !=-1) {
	//	  System.out.println((char)readByte);
		  
	 
	  
	  //while((readByte = fis.read(barr)) != -1);
	     // System.out.println((char)readByte);
	  
	  
		} catch (FileNotFoundException e) {
			System.out.println("�ش������� �����̾����ϴ�");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	  
	  
	  
	  

	


