package ch02;

public class VarTypeChange {
	
    
	public static void main(String[] args) {
		byte ba= -128 ;//128  byte는 1byte -128~127   -129  표현범위를 벗어났기 때문에 오류남
		System.out.println(ba - 1);//? -129  ba변수 1byte - 1  => 4byte처리됨 
		//4칙연산은 4바이트로 처리됨 숫자리터럴은 4바이트를 기본으로 처리함
		//그래서 1바이트 4바이트 4바이트이므로 최종 담기는 메모리 크기는 4바이트입니다.
		//그래서 -129를 출력할 수 있음
		System.out.println(ba);
		
		short sa=32767;
		System.out.println(sa);
		
		int ia=2100000000;//정수의 기본형임 
		
		long la = 2200000000000000000L;//8바이트로 21조보다 큰숫자나 작은 숫자를 표현할 때 사용함
		
		sa = ba;//short형 2바이트 = byte형 1바이트 데이터손실이 발생하지 않으므로 자바컴파일러가 오류 내지 않는다 묵시형 형변환, 암묵형 변환
	    ia = sa;// upcasting이라고 부름. 
	    la = ia;
	    ia = ba;
	    
	    ba =(byte) sa; // byte형 1바이트 = short형 2바이트 데이터손실이 발생할 수 있으므로 컴파일러가 오류를 냄
	    //그래서 프로그래머가 강제로 형을 바꿔주는 명령어를 써야 함. (바꿔줄 자료형) 변수명
	    //이것을 캐스팅 연산이라고 한다. 큰자료형이 작은 자료형으로 바뀌므로 down casting이라고 부른다.
	    //강제형변환이라고도 한다.  
	    sa =(short) ia;
	    ia =(int) la;
	    ba =(byte)  la;
	    sa =(short) ia;
	    
	    //실수형
	    float fa = 200.12345678912345678f;
	    double da = 200.12345678912345678;
	    System.out.println(fa);
	    System.out.println(da);
	    
	    double da1, da2;
	    float fa1, fa2;
	    
	    //up casting
	    da1=fa;
	    da2=fa;
	    fa = ia;  // 실수형 = 정수형
	    
	    //down casting
	    fa = ( float )da;
	    fa1 =( float )da;
	    fa2 =( float ) da;
	    ba   = (byte)    fa; // 정수형 = 실수형
	    sa = (short) fa;
	    ia = (int) fa;
	    la = (long) da;
	    la = (long) fa; //자료타입으로 따지기 
	    
	    //캐스팅 연산에서 다운인지 업인지 확인하는 순서 : 1. 자료타입 정수, 실수 따지기, 2 자료타입이 동일하면 메모리 용량으로 따지기 
	    System.out.println("<< 다운 캐스팅 한 자료 >>");
	    System.out.println(fa + "  " + fa1 + "  " + fa2);
	    System.out.println(ba + " " + sa + "  " + ia + " " + la);
	    //ba는 왜 -56을 찍었을까? 왜 200을 찍지 않았나? byte 크기가 -128 ~ 127이여서 범위를 범어나서

	     //자바에서 상속의 개념 
	    Parent p = new Parent(); //힙메모리에 Parent클래스를 변수와 메소드를 올려 준다. 
	    Child c = new Child(); //힙메모리에 Child클래스를 올려 준다
	    
	    Parent p1 = new Parent(); 
	    Child c1 = new Child(); 
	    
	    p = p1;//동일한 자료형이므로 넣을 수 있다.
	    c1 = c; 
	    //upcasting 코드 구현
	    p = c;
	    p1 = c1;
	    
	    //downcasting 코드 구현
	    c =(Child) p;
	    c1 =(Child) p1;
	    
	    //정수형을 Parent형으로 바꿀 수 있나요? 안된다
	  //  p = (Parent) ia;
	    
	    //Parent형으로 실수형으로 바꿀 수 있나요? 안된다. 
	  //  da = (double) p;
	 
	    //기본자료형 타입 ==>정수형 - byte short int long 논리형 - boolean 실수형 - float double 문자형-char
	    //기본자료형으로 변수를 선언하면 해당크기로 메모리가 만들어지고 해당리터럴 값을 넣어 주어야만 한다
	    
	    //기본자료형 8개 빼로 모두다 클래스 변수형은 모두 참조형(reference) 타입니다 참조형 타입의 메모리크기는 운영체제에 따라 다르다.
	    //만약 64bit운영체제인 경우는 8바이트입니다. 
	    
	    //참조형과 기본형 형변환 됩니까? 안됩니다.
	    
	    char ca='A';//문자형 1글자만 처리할 수 있음
	    char ca1='B';
	    ca = ca1;
	    ia = ca1;
	    sa =(short) ca1;
	    ba =(byte) ca1;
	    ca  =(char) ba;
	    da = ca;
	   // p = ca; 
	    //문자형을 'A' 나타내기
	    char a='A';//문자
	    char a1=65;//10진수
	    char a2=0b1000001;//2진수
	    char a3=00101;//8진수
	    char a4=0x0041;//16진수
	    char a5='\u0041';
	    
	    System.out.println(a);
	    System.out.println(a1);
	    System.out.println(a2);
	    System.out.println(a3);
	    System.out.println(a4);
	    System.out.println(a5);
	    
	    //자바에서 한글자의 문자를 처리할 때는 문자형 char 사용한다. 2바이트이다.
	    //문자는 유니코드표 숫자이므로 숫자형 변수로 형변환 할 수 있다.
	    
	    String nation = "Korea"; //문자열을 처리하는 클래스입니다. nation변수는 참조형 변수입니다
	    String nation1 = new String("korea"); 
	   // nation = (String) ca; 안됨 참조형과 기본형은 형변환 안됩니다. 
	   // ca = (char) nation; 안됨 
	    
	    int ii1=100;
	    
	    Integer i1 = new Integer(100);//참조형변수
	    Double d1 = new Double(3.14);//참조형 변수
	    float f1;
	    // nation=(String) i1; 참조형 변수끼리 자료형을 바꿀 때는 다운 캐스팅 방법으로 형변환하는 것이 아니라
	    nation = i1.toString(); //해당 클래스의 메소드를 이용해서 형변환을 해야 합니다. 
	    nation = d1.toString();//"3.14"
	    //실수형변수의 변환 메소드를 사용하여서 바꾸어 준다.
	    //그러므로 기본형과 참조형 형변환이 안되니깐
	    //기본형을 아예 참조형으로 선언하고 사용하는 경우도 많이 씁니다
	    //기본형 변수에 해당하는 클래스를 wrapper 클래스라고합니다
	    // byte - Byte, short - Short, int - Integer, long-Long
	    // char - Character, float - Float, double - Double,
	    // boolean - Boolean 
	    
	    f1=Float.parseFloat(nation);
	    System.out.println(f1);

	    Float ff1;
	    ff1=Float.valueOf(nation); 
	    System.out.println(ff1);
	    
	    
	    int ii5=100;
	    double dd5=200.15;
	    
	    dd5 = ii5 + dd5;
	    System.out.println(dd5);
	    
	    ii5 =(int)  (ii5 + dd5) ;
	    System.out.println(ii5);		
	}
    
}
