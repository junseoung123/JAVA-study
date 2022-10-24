package ch07;

public class ThreadEx07 {

	public static void main(String[] args) {
		// 611 notify() wait() �����忡�� ���� �߿����ڵ��Դϴ�
		
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();

	}

}


class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String returnValue = data;
		System.out.println("�Һ��� �����尡 ���� ������" + returnValue);
		data = null;
		notify();
		return returnValue;
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.data = data;
		System.out.println("�����ϴ� �����尡 ������ ������" + data);
		notify();
		
	}
}

//�����͸� �����ϴ� ������ - �ֹ�
class ProducerThread extends Thread {
	private DataBox dataBox;
	public ProducerThread(DataBox databox) {
		this.dataBox = databox;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
}


//�����͸� �Һ��ϴ� ������ - �մ�
class ConsumerThread extends Thread {
	private DataBox dataBox;
	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=3; i++) {
			String data = dataBox.getData();
		}
	}
}