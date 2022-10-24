package ch06;

public class ThreadEx06 {

	public static void main(String[] args) {
		
		WorkObject wo = new WorkObject();
		
		ThreadA ta = new ThreadA(wo);
		ThreadB tb = new ThreadB(wo);
		
		ta.start();
		tb.start();
		

	}

}

class WorkObject {
	public synchronized void methodA() {  //methodA ��ü�� �Ӱ迵������ ������ش�
		System.out.println("������A�� methodA() �۾� ����");
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


public synchronized void methodB() {  //methodA ��ü�� �Ӱ迵������ ������ش�
	System.out.println("������B�� methodB() �۾� ����");
	notify();
	
	try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}


class ThreadA extends Thread {
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
}

class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
}