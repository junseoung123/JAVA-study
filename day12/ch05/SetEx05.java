package ch05;

import java.util.*;

public class SetEx05 {

	public static void main(String[] args) {


		Set<Double> set1 = new HashSet<Double>();
		
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		
		Set<String> set3 = new TreeSet<String>();
		
		

		set1.add(1.25);
		set1.add(1.25);
		set1.add(1.25);

		set2.add(100);
		set2.add(80);
		set2.add(100);
		
		set3.add("A");
		set3.add("B");
		set3.add("A");
		
		Iterator<Double> it1 = set1.iterator();
		while(it1.hasNext()) {
			Double d = it1.next();
			System.out.println(d+ " ");
		}
		
		Iterator<Integer> it2 = set2.iterator();
		
		System.out.println("�Ѱ��� ������" + it2.next());
		System.out.println("�Ѱ��� ������" + it2.next());
		
		while(it1.hasNext()) {
			Integer d = it2.next();
			System.out.println(d+ " ");
		}
		
		//System.out.println("�Ѱ��� ������" + it2.next());
		
		System.out.println();
		for(String s : set3) {
			System.out.println(s + " ");
		}
		
		set1.add(1.2);
		set2.add(45);
		
		set1.remove(10.87);
		System.out.println("�����ϰ� ���");
		Iterator<Double> it4 =set1.iterator();
		while(it4.hasNext()) {
			Double d = it4.next();
			System.out.println(d+ " ");
		}
		
		System.out.println("set2 clear�ϱ��� ũ��" + set2.size());
		set2.clear();
		System.out.println("set clear���� ũ��" + set2.size());
		
		if(set3.isEmpty() ) System.out.println("����ִ�");
		else System.out.println("�Ⱥ���ִ�");
		
		if(set3.contains("A")) System.out.println("A�ִ�");
		else System.out.println("A����");
		
		
		Set deptSet = new HashSet();
		deptSet.add("�İ�");
		deptSet.add("����");
		deptSet.add("�Ǵ�");
		deptSet.add("�İ�");
		deptSet.add("�Ǵ�");
		
		System.out.println("�б����ִ°���?");
		Iterator<String> it6 = deptSet.iterator();
		while(it6.hasNext()) {
			System.out.println(it6.next());
		}
		
		//�ζ� 6�� ������
		Set lotto = new HashSet();
		int number;
		boolean flag = true;
		while(flag) {
			number = (int) (Math.random() *45) + 1;
			lotto.add(number);
			if(lotto.size() == 6) {flag = false; break;}
		}
		
		Iterator<Integer> it7 = lotto.iterator();
		while(it7.hasNext()) {
			System.out.println(it7.next() + " ");
		}
		
		
	}

}
