package ch03;

public class ThreadEx03 {

	public static void main(String[] args) {
		//����ȭ
		//�������� ���� New-Runnalbe-Run-End(Terinmated)
		//                   <- �Ͻ�����
		
		Calculator cal = new Calculator();
		User1 user1 = new User1();
		User2 user2 = new User2();
		
		user1.setCalculator(cal);
		user1.start();
		
		user2.setCalculator(cal);
		user2.start();
		
		System.out.println(user1.getState() + " user1"); 
		System.out.println(user2.getState() + " user2"); 
		Thread.State state=user1.getState();
		if(state == Thread.State.NEW) {
			user1.start();
		}
		if(state == Thread.State.TERMINATED ) {
			System.exit(0); //���α׷� �����ϱ�
		}

	}

}

class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
	

	//synchronized ����ȭ���� �Ӱ迵������ �޼ҵ� ��������
	public synchronized void setMemory(int memory) {
		System.out.println("�̰��� �Ӱ迵�� ���̹Ƿ� �� �����尡 ������ - �� �Ӱ迵�� ����" + Thread.currentThread().getName());
		synchronized (this) {
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
				
				} catch (InterruptedException e) {	}
			System.out.println(Thread.currentThread().getName() + " " + this.memory); 
			
		}
		
		
	}
	
}


class User1 extends Thread {
	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.setName("User1");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
		
		
	}
}


class User2 extends Thread {
	private Calculator calculator;
	public void setCalculator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
		
		
	}
}


