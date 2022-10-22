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
		// 기반 스트림-필수, 보조 기반스트림-선택
		// InputStream OutputStream, Reader, Writer << 기반스트림
		// Bufferedreader, Bufferedwriterm, DataInput<< 보조기반스트림 기반스트림에 반드시 끼워서 써야한다 *****
	    try {
		FileOutputStream fos1 = new FileOutputStream(new File("C:/temp/fos1.txt")); //주기반 스트림
		//빠르게 버퍼에 모아서 처리하기
		
		BufferedOutputStream bos = new BufferedOutputStream(fos1);
		DataOutputStream dos1 = new DataOutputStream(bos); //byte는 int boolean등등 표현불가 보조스트림 DataOutputStream사용
	    
		dos1.writeUTF("홍길동");
		dos1.writeDouble(95.5);
		dos1.writeInt(1);
		
		dos1.writeUTF("김자바");
		dos1.writeDouble(90.3);
		dos1.writeInt(2);
		
		//fos1.write(null)  주기반스트림의 write매소드안에는 매개변수가 double과 boolean등 기본형을 넣는곳이 없으니까 보조스트림사용
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
