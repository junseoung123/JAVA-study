package ch07;

import java.util.StringTokenizer;

public class StringEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "010627-1230123";
		char c = ssn.charAt(7);
		System.out.println(c);
		switch(c) {
			case '1' :
			case '3' : System.out.println("����"); break;
			case '2' :
			case '4' : System.out.println("����"); break;
				
		}
		
		byte[] b = "abcdef".getBytes();
		
		System.out.println((char)b[2] + " " + (char)b[5]);
		
		
		String name = "ǥ����������������";
		String searchName = "������";
		int s = name.indexOf(searchName);
		System.out.println( s);
		
		if(s<0) {
			System.out.println(searchName+"���� name������ ������� �ʽ��ϴ�");
		} else {
			System.out.println(searchName+"���� name������ ����ֽ��ϴ�");
		}
		
		System.out.println(name.substring(s, s+3));
		
		int aa = 123;
		String saa = String.valueOf(aa);
		
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] ts = text.split("&|,|-");
		System.out.println(ts[0]);
		for(String t : ts) {
			System.out.println();
		}
		
		String text2 = "ȫ�浿/�̼�ȫ/�ڿ���";
		StringTokenizer st = new StringTokenizer(text2, "/");
		int count = st.countTokens();
		System.out.println("��ū�� ���� ===>" + count);
		
		while(st.hasMoreElements()) {
			String token= st.nextToken();
			System.out.println(token);
		}
		
		String data = "ABC";
		data += "DEF";
		
		StringBuilder sb = new StringBuilder();
		sb.append("Java");
		sb.append("Program server");
		System.out.println(sb.toString());
		
		sb.insert(3, "KKK");
		System.out.println(sb.toString());

	}

}
