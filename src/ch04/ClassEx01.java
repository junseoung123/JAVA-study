package ch04;

public class ClassEx01 {

	public static void main(String[] args) {
		A a = new A(); //a��� ��ü ���� (�⺻������)
		
		//�ʵ�ȿ� ���� �ִ� ���1
		//1. ���� �ִ´�
		//a.kor = 100;
		//a.eng = 80;
		//2. �޼ҵ带 �̿��� �ֱ�
		//a.setKor(100);
		//a.setEng(80);
		//3 �����ڸ� �̿��Ͽ� �ֱ�
		A a1 = new A(100, 80); //����� ������
		
		//�ʵ尪 ��� ���
		//1 �ʵ带 ���� ���´�
		//����� ����
		//System.out.println(a1.kor);
		//System.out.println(a1.eng);
		//2 �޼ҵ带 �̿��� ��´�
		System.out.println(a1.getKor());
		System.out.println(a1.getEng());
		

	}

}

class A{
	int kor; //100
	int eng; //80
	
	public void setKor(int k) {
		kor = k;
		
	}
	public void setEng(int e) {
		eng = e;
	}
	public int getKor() {
		return kor;

	}
    public int getEng() {
    	return eng;
    }
	public A() {
		// �⺻������ - �����Ϸ� �����ڰ� �ƹ��͵���� �ڵ����� ������ش�
	}
	public A( int a, int b) {
		//����� ������ - ���α׷��Ӱ� ���������Ѵ�
		kor = a;
		eng = b;
	}
}
class B{
	
}