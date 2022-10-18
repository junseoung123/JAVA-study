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
			case '3' : System.out.println("남자"); break;
			case '2' :
			case '4' : System.out.println("여자"); break;
				
		}
		
		byte[] b = "abcdef".getBytes();
		
		System.out.println((char)b[2] + " " + (char)b[5]);
		
		
		String name = "표혜민장혜린최유경";
		String searchName = "장혜린";
		int s = name.indexOf(searchName);
		System.out.println( s);
		
		if(s<0) {
			System.out.println(searchName+"씨는 name변수에 들오있지 않습니다");
		} else {
			System.out.println(searchName+"씨는 name변수에 들어있습니다");
		}
		
		System.out.println(name.substring(s, s+3));
		
		int aa = 123;
		String saa = String.valueOf(aa);
		
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		String[] ts = text.split("&|,|-");
		System.out.println(ts[0]);
		for(String t : ts) {
			System.out.println();
		}
		
		String text2 = "홍길동/이수홍/박연수";
		StringTokenizer st = new StringTokenizer(text2, "/");
		int count = st.countTokens();
		System.out.println("토큰의 갯수 ===>" + count);
		
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
