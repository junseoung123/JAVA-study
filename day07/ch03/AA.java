package ch03;

public class AA extends A{
    int aafield;
	
	public void aMethod() {
		System.out.println("AAŬ������ �żҵ� Ǫ����");
		System.out.println(aafield);
	}
	
	public AA() {
		System.out.println("AA �ɷ����� �⺻������ �κ���");
		aafield = 200;
	}
	
	public AA(int aafield) {
		System.out.println("AŬ������ ����� ������ �κ���");
		this.aafield = aafield;
	}
	
	public AA(int aafield, int afield) {
		System.out.println("AAŬ������ ����� ������");
		this.aafield = aafield;
		//�θ� ����ʵ��� afield �� �ֱ� super
		super.afield =afield;
	}

}
