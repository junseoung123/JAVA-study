package ch08;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReverSerEx {

	public static void main(String[] args) throws Exception{
        //서울지사에서 serial.txt파일을 인터넷에 실어서 부산지사에 보냈다
		
		//부산지사에서는 다시 객체로 보이게 하기
		//역 직렬화
		//주 기반 스트림 객체생성하기 
		FileInputStream fis = new FileInputStream("C:/temp/serial.txt");
		//보조기반 스트림 객체생성
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
        System.out.println("field1 :" + v.field1);
        System.out.println("field2 :" + v.field2.field1);
        System.out.println("field3 :" + v.field3);
        System.out.println("field4 :" + v.field4);
        System.out.println("field5 :" + v.field5);
        
        ois.close();
        fis.close();

	}

}
