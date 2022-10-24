package ch05;

public class JoinEx {

	public static void main(String[] args) {
         //607
		SumThread sumThread = new SumThread();
		sumThread.start();
		try {
			sumThread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1~100까지 합은" + sumThread.getSum());
      
	}

}

class SumThread extends Thread {
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	@Override
	public void run() {
		for(int i=0; i<=100; i++) {
			sum += i;
		}
	}
}
