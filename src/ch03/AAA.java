package ch03;

public class AAA extends AA{
    int aaafield;
	
	public void aMethod() {
		System.out.println("AAAŬ������ �żҵ� Ǫ����");
		System.out.println(aaafield);
	}
	public AAA() {
		System.out.println("AAA �ɷ����� �⺻������ �κ���");
		aaafield = 300;
	}
	public AAA(int aaafield) {
		System.out.println("AŬ������ ����� ������ �κ���");
		this.aaafield = aaafield;
		
	}
	
	public AAA(int aaafield, int aafield) {
		System.out.println("AŬ������ ����� ������ �κ���");
		this.aaafield = aaafield;
		super.aafield = aafield; //����Ŭ����AA�� �־��ش�
	}
	
	public AAA(int aaafield, int aafield, int afield) {
		System.out.println("AŬ������ ����� ������ �κ���");
		this.aaafield = aaafield;
		super.aafield = aafield; //����Ŭ����AA�� �־��ش�
		super.afield =afield;
	}

}
