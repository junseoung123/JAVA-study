package ch07;

import java.util.*;

public class TreeMapEx07 {

	public static void main(String[] args) {

     TreeMap<String, Integer> ts = new TreeMap<String, Integer>();
     
     ts.put("�ǾƳ�", 10);
     ts.put("���ǰ�", 20);
     ts.put("�İ�", 5);
     ts.put("������", 55);
     
     int size = ts.size();
     for(int i=0; i<size; i++) {
    	 System.out.println(ts.pollLastEntry());
     }

	}

}
