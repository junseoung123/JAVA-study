package ch05;

import java.util.Calendar;
import java.util.Scanner;

public class ProcessOrderEx {

	public static void main(String[] args) {
		// 자바 처리순서 메모리에 올라가는순서
		// static{} -> static 변수 메소드가 -> {} -> 부모생성자 -> 자식생성자
		// -> main() 메소드 수행하는 순서대로 처리
		
		//static 변수 메소드는 new안해도 사용가능
		//System.out.println(Process01.a);
		//Process01.sMethod();
		
		Process01 p01 = new Process01();
		
	    Scanner sc = new Scanner(System.in);
	    //System.setIn(in);
	}

}
