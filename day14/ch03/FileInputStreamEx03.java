package ch03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Reader;

public class FileInputStreamEx03 {

	public static void main(String[] args) {
		
		// 997 io스트림
		// 파일 읽어들이기
		try {
	  File file1 = new File("C://Temp/readEx01.txt"); //사용해줄 파일 객체생성
	  File file2 = new File("c://Temp/writeEx01.txt");
	  
	  FileInputStream fis = new FileInputStream(file1);
	  int readByte;
	  //byte[] barr = new byte[30];
	  
	  //출력 스트림
	  FileOutputStream fos = new FileOutputStream(file2);
	  while((readByte =fis.read())!=-1) {
		  fos.write(readByte);
		  
	  }
	// 그림복사
			// read(배열) write러열)
			
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
			}; //Reader라는 클래스는 추상클래스이다. 원래는 자식클래스를 두고 재정희해서 사용해야한다
	  
			
			
		 
	 
	 // while((readByte=fis.read()) !=-1) {
	//	  System.out.println((char)readByte);
		  
	 
	  
	  //while((readByte = fis.read(barr)) != -1);
	     // System.out.println((char)readByte);
	  
	  
		} catch (FileNotFoundException e) {
			System.out.println("해당폴더에 파일이없습니다");
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	  
	  
	  
	  

	


