package ch02;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ThreadEx02 {

	public static void main(String[] args) {
		FileInput fileInput = new FileInput();
		FileOutput fileOutput = new FileOutput();
		AZoutput aZoutput = new AZoutput();
		
		//Runnalbe구현 객체는 Thread객체안에 매개변수넣기
		Thread t1 = new Thread(fileInput);
		Thread t2 = new Thread(aZoutput);
		
		//스래드 실행하기
		t1.start();
		t2.start();
		fileOutput.start();
		
		//스레드의 우선순위
		t1.setPriority(Thread.MAX_PRIORITY);
		fileOutput.setPriority(Thread.MIN_PRIORITY);

		//띵 문자 200개 나오게하기
		try {
		for(int i=0; i<200; i++) {
			Thread.sleep(500);
			System.out.println("프로그램총괄업무");
			
		}
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		//스레드 이름 알기
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램시작 스레드 이름 :" + mainThread);
		
		String t1ThreadName = t1.getName();
		String t2ThreadName = t2.getName();
		String fileOutputName = fileOutput.getName();
		
		System.out.println("스레드 이름" + t1ThreadName + " " + t2ThreadName + " " + fileOutputName);
		
	}

}

//파일 읽어오기
class FileInput implements Runnable {
	@Override
	public void run() {
		try {
		File file1 = new File("C:/temp/a.txt");
		
			FileInputStream fis = new FileInputStream(file1);
			System.out.println("파일 읽기 성공");
			int bytes;
			while ((bytes = fis.read()) != -1) {
				System.out.print(bytes + " ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

//파일 출력하기
class FileOutput extends Thread{
	@Override
	public void run() {
		try {
		File file2 = new File("C:/temp/b.txt");
		FileOutputStream fos = new FileOutputStream(file2);
		BufferedOutputStream bos = new BufferedOutputStream(fos); //속도증가
	    DataOutputStream dos = new DataOutputStream(bos);
	    
	    dos.writeUTF("홍길동");
	    dos.writeInt(100);
	    dos.writeDouble(12.35);
	    dos.flush(); // 다 내보내기
	    dos.close();
	    
	    System.out.println("파일출력완료");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}


//A~Z 화면 출력하기

class AZoutput implements Runnable {
	@Override
	public void run() {
		try {
		for(int i=65; i<91; i++) {
			
				Thread.sleep(500);
			
			System.out.print((char)i + " ");
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

