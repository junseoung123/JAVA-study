package ch05;

import java.io.File;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx1018 {

	public static void main(String[] args) {
		// 1018
		// File 클래스는 파일에 대한 용량, 파일명, 파일 만들기 등 다양한 메소드가 있다
		
		try {
       File dir = new File("C:/temp/Dir")	;
       File file1 = new File("C:/temp/file1.txt");
       File file2 = new File("C:/temp/file2.txt");
       File file3 = new File(new URI("file:///c:/temp/file3.txt"));
       
       if(dir.exists() == false) { dir.mkdirs();}//mk directory == 파일 만들어라
       if(file1.exists() == false) {file1.createNewFile();}
       if(file2.exists() ==  false) {file2.createNewFile();}
       if(file3.exists() ==  false) {file3.createNewFile();}
       
       File temp = new File("C:/temp");
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");//날짜 표시하는데 이런 형태(포맷)로 표시해라
       File[] contents = temp.listFiles();//file 개열로 담는다 이름은 contents
       System.out.println("날짜      시간      형태      크기      이름");
       System.out.println("====================");
       
       for(File file : contents) {
    	   System.out.println(sdf.format(new Date(file.lastModified())));
    	   if(file.isDirectory()) {
    		   System.out.print("\t<DIR>\t\t\t" + "\t" + file.getName());
    	   }else {
    		   System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
    	   }
    	   System.out.println();
         }
       } catch (Exception e) {
		// TODO: handle exception
	}

	}

}
