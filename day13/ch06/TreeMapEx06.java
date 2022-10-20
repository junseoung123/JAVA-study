package ch06;

import java.util.*;

public class TreeMapEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> scores =new TreeMap<Integer, String>();
		
		scores.put(new Integer(87), "ȫ�浿");
		scores.put(new Integer(98), "�̵���");
		scores.put(new Integer(75), "�ڱ��");
		scores.put(new Integer(95), "�ſ��");
		scores.put(new Integer(80), "���ڹ�");
		
		Map.Entry<Integer, String> entry = null;
		
		entry = scores.firstEntry();
		System.out.println(entry.getKey() + " " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println(entry.getKey() + " " +entry.getValue());
		
		
		//90~100 ���� ��� �˻�
		NavigableMap<Integer, String> ss = scores.subMap(new Integer(90), true, new Integer(100), true);
		for(Map.Entry<Integer, String> s : ss.entrySet()) {
			System.out.println(s.getKey() + " " + s.getValue());
		}

	}

}
