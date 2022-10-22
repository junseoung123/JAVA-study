package ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialEx1045 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// 직렬화 
	    // 주 기반 스트림 만들기
		FileOutputStream fos = new FileOutputStream(new File("c:/temp/serial.txt"));
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA();
		classA.field1 = 100;
		classA.field2.field1 = 200;
		classA.field3 = 300;
		classA.field4 = 400;
		classA.field5 = 500;
		
		//직렬화하는 메소드 호출
		oos.writeObject(classA);
		oos.flush();
		oos.close();
		fos.close();
		
		
		
	}

}

//직렬화 하려는 클래스를 implements Serializable
//직렬화 네트워크에 데이터를 보내기 위해서 반드시 처리해야하는것
class ClassA implements Serializable{
	
	static final long serialVersionUID = 1234123141251L;
	int field1;
	ClassB field2 = new ClassB();
	static int field3; //직렬화 제외
	transient int field4; //직렬화 제외
	int field5;
}

class ClassB implements Serializable{
    int field1;	
}
