package ch01;

public class InstanceofEx {

	public static void main(String[] args) {
		//���
		//������ Animal animal = new Cat();
		//�������� -> ǥ��ȭ ����ȭ
		//�θ� �޼ҵ� sound() {�չ�����} ������ �ڽ� �޼ҵ� sound() {�߿�}
		
		//instanceof : ���������� � Ŭ������ �����Ҽ��ִ��� �Ǵ����ִ� ��ɾ�
		
		//�������� �����
		
		Parent parent= new Child();
		
		//method1�� ȣ���غ��ÿ�
		InstanceofEx.method1(parent);
		
		//�޼ҵ�2 ����� �Ű������� parent1�������� �ޱ�
		//Parnet Ŭ������ ��ü�����ؼ� �ش� �������� parnet1�� �Ű������� ������
		//parent1���� ParentŬ������ �����Ҽ��ִ��� �˾ƺ���
		//parent1���� ChildŬ������ �����Ҽ��ִ��� �˾ƺ���
		
		Parent parent1 = new Parent();
		InstanceofEx.method2(parent1);

	}
	
	public static void method1( Parent parent) {
		System.out.println(parent instanceof Child);
		System.out.println(parent instanceof Parent); //Parent�� ���� parent�� ����ִ�?
		if( parent instanceof Child) {
			Child c  = (Child) parent;
		} else {
			System.out.println("�ٿ�ĳ���� �Ҽ������ϴ�");
		}
	}
	
	public static void method2( Parent parent1 ) {
		System.out.println(parent1 instanceof Parent);
		if( parent1 instanceof Child) {
			Child c  = (Child) parent1;
		} else {
			System.out.println("�ٿ�ĳ���� �Ҽ������ϴ�");
		}
	}

}
