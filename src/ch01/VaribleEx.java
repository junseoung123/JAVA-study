package ch01;

public class VaribleEx {
             //���� ���ϱ�
	static int sa=200; //�������� �� �޸� �Ҵ�ǰ� ���α׷��� ���������� �޸𸮿� ��� �����ִ�
	//static�� ����ϴ� ������ ��� ������ ���� �����ؾ��ϴ� ����
	int ia=100;
	//�ӽ÷� ����ϰ� ������ �Ǵ� ����
	
	public       static              void        main(String[] args) {
	//����������, ���� ���ÿ��� �Ҵ��ض�	    ����Ÿ��          �޼ҵ��
		Ex01 ex01 = new Ex01();
        ex01.ex01Method();
        
        System.out.println(sa); //sa���� ����ض�
        
        VaribleEx ve = new VaribleEx(); //VaribleEx��� Ŭ�������� ve�� ���ϱ�
        System.out.println(ve.ia); //ve�ȿ� �ִ� ia���� ����ض�
        
        int returnVar = ve.method2(); //�޼ҵ� ȣ���Ͽ��� ���Ϲ޾� ������ ���
        System.out.println(returnVar); //����ϱ�
        
        String returnName = ve.method3();
        System.out.println(returnName);
        
        boolean returnBoolean =ve.method4();
        System.out.println(returnBoolean);
        
        double returnDouble =ve.method5();
        System.out.println(returnDouble);
        
        float returnFloat =ve.method6();
        System.out.println(returnFloat);
	}
	//����Ÿ���� �޼ҵ带 �����ϰ� ���� �޼ҵ� ȣ���ϴ� ������ �ǵ����־���ϴ� �ڷ���
        public int method2() {
        	return 300; //���ϰ�
        	
        }
        public String method3() {
        	return "ȫ�浿";
        }
        //true false return �ϴ� �޼ҵ� �����ϱ�
        public boolean method4() {
        	return true;
        }
        //3.14���� return�ϴ� �޼ҵ� �����ϱ�
        public double method5() {
        	return 3.14;
        }
        //500.78f ���ڸ� return�ϴ� �޼ҵ� �����ϱ� float
        public float method6() {
        	return 500.78f;
        }
}
