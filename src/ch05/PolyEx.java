package ch05;

public class PolyEx {

	public static void main(String[] args) {
		
		//Dog�� ��ü�����ϼ��� ���������� �θ�Ŭ����Ÿ������ �ϼ��� - ������
		Animal aa1 = new Dog();
		//DogŬ������ �ʵ带 �����Ҽ� �ֽ��ϱ�? X
		//�׷��ٸ� ��� �����ұ�? aa1�� �ڷ����� Dog������ ����ȯ ���ֱ�
		//Animal Ŭ���� �θ�Ŭ�����̴ϱ ūŸ��, DogŬ���� �ڽ�Ŭ�����̴ϱ� ����Ÿ��
		// Dog(����) Ÿ������ = Animal Ÿ��(ū)��
		
		Dog dd1 = (Dog) aa1;
		//aa1.dogfiled = 1000;
		
		//AnimalŬ������ �ʵ带 �����Ҽ��ֽ��ϱ�? O
		//aa1.animalField = 2000;
		
		// ������    Animal animal = new Cat();
		//         �θ�Ŭ���� �������� = new �ڽ�Ŭ����();
		
		//Dog Ŭ���� ��ü�����ϱ�
		Dog dog = new Dog();
		//Dog�� Animal ��θ� ����Ŵ
		//dog.animalField =100;
		//dog.dogfiled =200;
		
		//Cat Ŭ���� ��ü�����ϱ�
		Cat cat = new Cat();
		
		//������
		Animal a1 = new Dog();
		//Animal�� ����Ŵ
		//a1.animalField=300;
		//a1.dogfiled=400; X
		Animal a2 = new Cat();
		
		Dog d3 = new Dog();
		Animal a3 = new Dog();
		
		a3.sound();
		//�θ� Ŭ���� Animal�� sound() �޼ҵ带
		// �ڽ�Ŭ���� DOg���� sound()�޼ҵ带 �������ߴ��� �������� ����ϴϱ� �ڽ��� sound �޼ҵ� ȣ��
		
		//���� DB�÷����� �θ� Ŭ������ �ΰ�
		//����Ŭ Ŭ������ �ڽ����� �ξ��� ��� �θ�Ŭ������ �޼ҵ带 �������̵��ϰ� �������� ����ϸ� �θ� DBŬ������ ������ ������ָ�
		//�������� ����Ŭ�εǰ� ������ DB�÷������� �ȴ�

	}

}
