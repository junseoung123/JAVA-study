package ch02;

public class VarTypeChange {
	
    
	public static void main(String[] args) {
		byte ba= -128 ;//128  byte�� 1byte -128~127   -129  ǥ�������� ����� ������ ������
		System.out.println(ba - 1);//? -129  ba���� 1byte - 1  => 4byteó���� 
		//4Ģ������ 4����Ʈ�� ó���� ���ڸ��ͷ��� 4����Ʈ�� �⺻���� ó����
		//�׷��� 1����Ʈ 4����Ʈ 4����Ʈ�̹Ƿ� ���� ���� �޸� ũ��� 4����Ʈ�Դϴ�.
		//�׷��� -129�� ����� �� ����
		System.out.println(ba);
		
		short sa=32767;
		System.out.println(sa);
		
		int ia=2100000000;//������ �⺻���� 
		
		long la = 2200000000000000000L;//8����Ʈ�� 21������ ū���ڳ� ���� ���ڸ� ǥ���� �� �����
		
		sa = ba;//short�� 2����Ʈ = byte�� 1����Ʈ �����ͼս��� �߻����� �����Ƿ� �ڹ������Ϸ��� ���� ���� �ʴ´� ������ ����ȯ, �Ϲ��� ��ȯ
	    ia = sa;// upcasting�̶�� �θ�. 
	    la = ia;
	    ia = ba;
	    
	    ba =(byte) sa; // byte�� 1����Ʈ = short�� 2����Ʈ �����ͼս��� �߻��� �� �����Ƿ� �����Ϸ��� ������ ��
	    //�׷��� ���α׷��Ӱ� ������ ���� �ٲ��ִ� ��ɾ ��� ��. (�ٲ��� �ڷ���) ������
	    //�̰��� ĳ���� �����̶�� �Ѵ�. ū�ڷ����� ���� �ڷ������� �ٲ�Ƿ� down casting�̶�� �θ���.
	    //��������ȯ�̶�� �Ѵ�.  
	    sa =(short) ia;
	    ia =(int) la;
	    ba =(byte)  la;
	    sa =(short) ia;
	    
	    //�Ǽ���
	    float fa = 200.12345678912345678f;
	    double da = 200.12345678912345678;
	    System.out.println(fa);
	    System.out.println(da);
	    
	    double da1, da2;
	    float fa1, fa2;
	    
	    //up casting
	    da1=fa;
	    da2=fa;
	    fa = ia;  // �Ǽ��� = ������
	    
	    //down casting
	    fa = ( float )da;
	    fa1 =( float )da;
	    fa2 =( float ) da;
	    ba   = (byte)    fa; // ������ = �Ǽ���
	    sa = (short) fa;
	    ia = (int) fa;
	    la = (long) da;
	    la = (long) fa; //�ڷ�Ÿ������ ������ 
	    
	    //ĳ���� ���꿡�� �ٿ����� ������ Ȯ���ϴ� ���� : 1. �ڷ�Ÿ�� ����, �Ǽ� ������, 2 �ڷ�Ÿ���� �����ϸ� �޸� �뷮���� ������ 
	    System.out.println("<< �ٿ� ĳ���� �� �ڷ� >>");
	    System.out.println(fa + "  " + fa1 + "  " + fa2);
	    System.out.println(ba + " " + sa + "  " + ia + " " + la);
	    //ba�� �� -56�� �������? �� 200�� ���� �ʾҳ�? byte ũ�Ⱑ -128 ~ 127�̿��� ������ �����

	     //�ڹٿ��� ����� ���� 
	    Parent p = new Parent(); //���޸𸮿� ParentŬ������ ������ �޼ҵ带 �÷� �ش�. 
	    Child c = new Child(); //���޸𸮿� ChildŬ������ �÷� �ش�
	    
	    Parent p1 = new Parent(); 
	    Child c1 = new Child(); 
	    
	    p = p1;//������ �ڷ����̹Ƿ� ���� �� �ִ�.
	    c1 = c; 
	    //upcasting �ڵ� ����
	    p = c;
	    p1 = c1;
	    
	    //downcasting �ڵ� ����
	    c =(Child) p;
	    c1 =(Child) p1;
	    
	    //�������� Parent������ �ٲ� �� �ֳ���? �ȵȴ�
	  //  p = (Parent) ia;
	    
	    //Parent������ �Ǽ������� �ٲ� �� �ֳ���? �ȵȴ�. 
	  //  da = (double) p;
	 
	    //�⺻�ڷ��� Ÿ�� ==>������ - byte short int long ���� - boolean �Ǽ��� - float double ������-char
	    //�⺻�ڷ������� ������ �����ϸ� �ش�ũ��� �޸𸮰� ��������� �ش縮�ͷ� ���� �־� �־�߸� �Ѵ�
	    
	    //�⺻�ڷ��� 8�� ���� ��δ� Ŭ���� �������� ��� ������(reference) Ÿ�Դϴ� ������ Ÿ���� �޸�ũ��� �ü���� ���� �ٸ���.
	    //���� 64bit�ü���� ���� 8����Ʈ�Դϴ�. 
	    
	    //�������� �⺻�� ����ȯ �˴ϱ�? �ȵ˴ϴ�.
	    
	    char ca='A';//������ 1���ڸ� ó���� �� ����
	    char ca1='B';
	    ca = ca1;
	    ia = ca1;
	    sa =(short) ca1;
	    ba =(byte) ca1;
	    ca  =(char) ba;
	    da = ca;
	   // p = ca; 
	    //�������� 'A' ��Ÿ����
	    char a='A';//����
	    char a1=65;//10����
	    char a2=0b1000001;//2����
	    char a3=00101;//8����
	    char a4=0x0041;//16����
	    char a5='\u0041';
	    
	    System.out.println(a);
	    System.out.println(a1);
	    System.out.println(a2);
	    System.out.println(a3);
	    System.out.println(a4);
	    System.out.println(a5);
	    
	    //�ڹٿ��� �ѱ����� ���ڸ� ó���� ���� ������ char ����Ѵ�. 2����Ʈ�̴�.
	    //���ڴ� �����ڵ�ǥ �����̹Ƿ� ������ ������ ����ȯ �� �� �ִ�.
	    
	    String nation = "Korea"; //���ڿ��� ó���ϴ� Ŭ�����Դϴ�. nation������ ������ �����Դϴ�
	    String nation1 = new String("korea"); 
	   // nation = (String) ca; �ȵ� �������� �⺻���� ����ȯ �ȵ˴ϴ�. 
	   // ca = (char) nation; �ȵ� 
	    
	    int ii1=100;
	    
	    Integer i1 = new Integer(100);//����������
	    Double d1 = new Double(3.14);//������ ����
	    float f1;
	    // nation=(String) i1; ������ �������� �ڷ����� �ٲ� ���� �ٿ� ĳ���� ������� ����ȯ�ϴ� ���� �ƴ϶�
	    nation = i1.toString(); //�ش� Ŭ������ �޼ҵ带 �̿��ؼ� ����ȯ�� �ؾ� �մϴ�. 
	    nation = d1.toString();//"3.14"
	    //�Ǽ��������� ��ȯ �޼ҵ带 ����Ͽ��� �ٲپ� �ش�.
	    //�׷��Ƿ� �⺻���� ������ ����ȯ�� �ȵǴϱ�
	    //�⺻���� �ƿ� ���������� �����ϰ� ����ϴ� ��쵵 ���� ���ϴ�
	    //�⺻�� ������ �ش��ϴ� Ŭ������ wrapper Ŭ��������մϴ�
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
