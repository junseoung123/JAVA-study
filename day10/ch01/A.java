package ch01;

public class A {
	int afield; //�ʵ�
	static int safield; //����ʵ�
	// bfield ���Ұ�
	// ibMethod(); ���Ұ�
	void iaMethod() { } //�޼ҵ�
	static void siaMethod() { } //�����޼ҵ�
	public A() { } //������
	public A(int afield, int  safield) { } //�����������
	
	public class B{
		int bfield; //�ʵ�
		//static int sbfield; //����ʵ�
		void ibMethod() { 
			afield = 100;
			A.safield =200;
			iaMethod();
			A.siaMethod();
			bfield = 400;
			System.out.println("B class ibMethod�κ�");
			} //�޼ҵ�
		//static void sibMethod() { } //�����޼ҵ�
		public B() {
			super(); //AŬ������ ������ X    BŬ������ �θ��� ObjectŬ������ ����
		} //������
		public B(int bfield, int  sbfield) { } //�����������

	}

}
