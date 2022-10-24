package ch01;

public class ThreadEx01 {

	public static void main(String[] args) {
		//576 ������
		Task1 task1 = new Task1();
		Task2 task2 = new Task2();
		Task3 task3 = new Task3();
		
		//�޼ҵ� ȣ��
		//���1 Runnable ������ü�� Thread()��üȭ ���� start()�� ȣ���ϱ�
		Thread task1T= new Thread(task1);
		task1T.start();
		
		
		System.out.println();
		
		//���2 Thread�� ��۹��� �ڼ�Ŭ����
		task2.start();
		
		//���3 Task3�� �Ϲݸ޼ҵ带 �̿��ؼ� ������ȣ��
		task3.method();
		
		
		
		try {
		for(int i=0; i<20; i++) {
			System.out.print(i +" ");
			
			Thread.sleep(1000); //���� ����
		}
		}catch (InterruptedException e) {
				// TODO: handle exceptio
			e.printStackTrace();
			}
			
		}
		
	    
		

	}




class Task1 implements Runnable{
	public void run() {
		for(int i=0; i<10; i++) {
		System.out.println("�̰��� ��������� 1�� - ��Ʈ��ũ ó����");
	}
	}
}

class Task2 extends Thread{
	
	//Thread thread = new Thread(new Runnable() {
		
		@Override
		
		public void run() {
			for(int i=0; i<10; i++) {
			System.out.println("�̰��� �۾������� 2���� - ȭ�鱸�� ó����");
			}
		}
	//});
}

class Task3 {
	Runnable task3 = new Task10();
	Thread thread = new Thread(task3);
	
	void method() {
		thread.start();
	}
}

class Task10 implements Runnable{
	@Override
	public void run() {
	System.out.println("�̰��� �۾������� 3���� - ��׶���ó����");	
	}
    
}