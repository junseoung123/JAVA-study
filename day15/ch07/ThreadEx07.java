package ch07;

public class ThreadEx07 {

	public static void main(String[] args) {
		// 611 notify() wait() 스레드에서 제일 중요한코드입니다
		
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
		System.out.println("소비자 스레드가 읽은 데이터" + returnValue);
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
		System.out.println("생산하는 스레드가 생성한 데이터" + data);
		notify();
		
	}
}

//데이터를 생산하는 스레드 - 주방
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


//데이터를 소비하는 쓰레드 - 손님
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