package ch03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionFrameWordEx01 {

	public static void main(String[] args) {


		ArrayList al = new ArrayList();
		
		List list = new ArrayList();
		
		list.add(1);
		list.add(true);
		list.add("홍길동");
		System.out.println("자료의 갯수" + list.size());
		
		list.add(1, "kkk"); //1번 인덱스에 KKK넣기
		list.set(1, "bbb"); //1번 인덱스 값 없어지고 bbb들어감
		
		System.out.println(list.get(0));
		
		for( int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.remove("홍길동");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println();
		
		
		//ArrayList의 장점
		int[] a = new int[10];
		
		List aa1 = Arrays.asList("홍길동", "정현희", "최진수",1 ,true);
		for(int i=0; i<aa1.size(); i++) {
			System.out.println(aa1.get(i) + " ");
		}
		System.out.println();
		
		Iterator it= aa1.iterator();
		while(it.hasNext()) {
			Object ob =it.next();
			System.out.println(ob);
		}
		
		List list2 = new ArrayList();
		
		list2.add(100);
		list2.add(50);
		list2.add(100);
		list2.add(20);
		list2.add(100);
		
		Iterator<Integer> it2 = list2.iterator();
		while(it2.hasNext()) {
			Integer ita2 = it2.next();
			System.out.println(ita2 + " ");
		}

	}

}
