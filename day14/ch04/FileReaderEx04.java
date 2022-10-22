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
		// 문자기반 파일을 읽어서 복사하는 방법
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
		    fw1.flush();//버퍼안 자료를 모두 내보내라 
		}
		
		//문자 기반으로 이미지를 복사해보기 ~Reader ~Writer 클래스 사용불가 이미지는 바이트기반 처리만 가능함
		File i1 = new File("C:/Temp/snoopy");
		File i2 = new File("C:/Temp/copysnoopy1");
		
		FileReader ir1 = new FileReader(i1 );
		FileWriter iw1 = new FileWriter(i2 );
	
		while((readBytes = ir1.read())!=-1) {
			//System.out.println((char)readBytes);
		    iw1.write(readBytes);
		    iw1.flush();//버퍼안 자료를 모두 내보내라 
		}
		
		//키보드로 입력받아서 파일 만들어보기
		
		File f3 = new File("c://temp//keyFile.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("이곳에 문자를 입력해주세요");
		String keyin = sc.next();
	     
		FileWriter fw3 = new FileWriter(f3);
		fw3.write(keyin);
		fw3.flush();
		fw3.close();
		
		
		
		} catch (FileNotFoundException e) {
			System.out.println("파일오류");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
