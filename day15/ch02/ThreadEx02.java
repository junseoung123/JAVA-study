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
		
		//Runnalbe���� ��ü�� Thread��ü�ȿ� �Ű������ֱ�
		Thread t1 = new Thread(fileInput);
		Thread t2 = new Thread(aZoutput);
		
		//������ �����ϱ�
		t1.start();
		t2.start();
		fileOutput.start();
		
		//�������� �켱����
		t1.setPriority(Thread.MAX_PRIORITY);
		fileOutput.setPriority(Thread.MIN_PRIORITY);

		//�� ���� 200�� �������ϱ�
		try {
		for(int i=0; i<200; i++) {
			Thread.sleep(500);
			System.out.println("���α׷��Ѱ�����");
			
		}
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		//������ �̸� �˱�
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷����� ������ �̸� :" + mainThread);
		
		String t1ThreadName = t1.getName();
		String t2ThreadName = t2.getName();
		String fileOutputName = fileOutput.getName();
		
		System.out.println("������ �̸�" + t1ThreadName + " " + t2ThreadName + " " + fileOutputName);
		
	}

}

//���� �о����
class FileInput implements Runnable {
	@Override
	public void run() {
		try {
		File file1 = new File("C:/temp/a.txt");
		
			FileInputStream fis = new FileInputStream(file1);
			System.out.println("���� �б� ����");
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

//���� ����ϱ�
class FileOutput extends Thread{
	@Override
	public void run() {
		try {
		File file2 = new File("C:/temp/b.txt");
		FileOutputStream fos = new FileOutputStream(file2);
		BufferedOutputStream bos = new BufferedOutputStream(fos); //�ӵ�����
	    DataOutputStream dos = new DataOutputStream(bos);
	    
	    dos.writeUTF("ȫ�浿");
	    dos.writeInt(100);
	    dos.writeDouble(12.35);
	    dos.flush(); // �� ��������
	    dos.close();
	    
	    System.out.println("������¿Ϸ�");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}


//A~Z ȭ�� ����ϱ�

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

