package ch05;

import java.util.Calendar;
import java.util.Scanner;

public class ProcessOrderEx {

	public static void main(String[] args) {
		// �ڹ� ó������ �޸𸮿� �ö󰡴¼���
		// static{} -> static ���� �޼ҵ尡 -> {} -> �θ������ -> �ڽĻ�����
		// -> main() �޼ҵ� �����ϴ� ������� ó��
		
		//static ���� �޼ҵ�� new���ص� ��밡��
		//System.out.println(Process01.a);
		//Process01.sMethod();
		
		Process01 p01 = new Process01();
		
	    Scanner sc = new Scanner(System.in);
	    //System.setIn(in);
	}

}
