package ch08;

public class ThreadEx08 {

	public static void main(String[] args) {
		
		PrintThread2 pt2 = new PrintThread2();
		pt2.start();
		pt2.interrupt();
		
		pt2.setDaemon(true); //���󽺷��� = �� �����带 �����ִ� ���� ������ �ƹ��͵� ���ϸ� false�� �⺻
		

	}

}

class PrintThread2 extends Thread{
	
	@Override
	public void run() {
		try {
		while(true) {
			System.out.println("������");
			if(Thread.interrupted()) {
				break;
			}
			
				Thread.sleep(1000);
		}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("�ڿ�����");
			System.out.println("��������");
		}
	}
