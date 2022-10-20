package ch07;

import java.util.*;

public class TreeMapEx07 {

	public static void main(String[] args) {

     TreeMap<String, Integer> ts = new TreeMap<String, Integer>();
     
     ts.put("피아노", 10);
     ts.put("성악과", 20);
     ts.put("컴공", 5);
     ts.put("디자인", 55);
     
     int size = ts.size();
     for(int i=0; i<size; i++) {
    	 System.out.println(ts.pollLastEntry());
     }

	}

}
